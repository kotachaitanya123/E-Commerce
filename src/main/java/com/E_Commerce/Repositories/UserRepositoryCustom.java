package com.E_Commerce.Repositories;

import com.E_Commerce.Entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositoryCustom {
    Optional<User> findByUserPhone(String phone);
}