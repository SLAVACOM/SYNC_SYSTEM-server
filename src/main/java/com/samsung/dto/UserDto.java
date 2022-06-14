package com.samsung.dto;

import com.samsung.domain.Event;
import com.samsung.domain.User;
import liquibase.pro.packaged.U;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private int id;
    private String password;
    private String mail;

    public static UserDto toDto(User user){
        return new UserDto(user.getId(),user.getPassword(), user.getMail());
    }

    public static User toDomainObj(UserDto userDto){
        return new User(userDto.getId(), userDto.getPassword(),userDto.getMail());
    }
}
