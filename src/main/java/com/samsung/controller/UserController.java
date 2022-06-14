package com.samsung.controller;

import com.samsung.domain.User;
import com.samsung.dto.UserDto;
import com.samsung.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public List<UserDto> getAllUser(){

        return userService.getAll().stream().map(UserDto::toDto).collect(Collectors.toList());
    }

    @PostMapping("/user")
        public UserDto insertEvent(@RequestParam String password, @RequestParam String mail){
        User user = userService.insert(password,mail);
        return UserDto.toDto(user);
    }
    @PutMapping("/user/{id}")
    public UserDto updateUser(@PathVariable int id, @RequestParam String password, @RequestParam String mail){
        
        User user = userService.update(id,password,mail);
        return UserDto.toDto(user);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteById(id);
    }

    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable int id){
        User user = userService.getById(id);
        return UserDto.toDto(user);
    }


    @GetMapping("/user/email/{email}")
    public UserDto getUserByMail(@PathVariable String email){
        User user = userService.getByEnail(email);
        return UserDto.toDto(user);
    }



}
