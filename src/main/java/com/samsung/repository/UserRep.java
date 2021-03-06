package com.samsung.repository;

import com.samsung.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User,Integer> {
    User findByMail(String email);
}
