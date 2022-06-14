package com.samsung.service;

import com.samsung.domain.User;
import com.samsung.repository.UserRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImplem implements UserService{

    private final UserRep userRep;

    @Override
    public User insert(String password, String mail) {
        User user = User.builder().password(password).mail(mail).build();
        return userRep.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRep.findAll();
    }


    @Override
    public User getById(int id) {
        return userRep.getById(id);
    }

    @Override
    public User getByEnail(String email) {
        return userRep.findByMail(email);
    }


    @Override
    public User update(int id, String password, String sdsd) {
        User user= User.builder().id(id).password(password).mail(sdsd).build();
        return userRep.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRep.deleteById(id);

    }

}
