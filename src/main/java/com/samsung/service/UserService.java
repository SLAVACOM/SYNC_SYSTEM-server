package com.samsung.service;

import com.samsung.domain.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    User insert(String password, String mail);

    List<User> getAll();

    User getById(int id);
    User getByEnail(String email);

    User update(int id, String password, String mail);

    void deleteById(int id);
}
