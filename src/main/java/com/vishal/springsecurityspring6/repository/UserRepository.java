package com.vishal.springsecurityspring6.repository;

import com.vishal.springsecurityspring6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
