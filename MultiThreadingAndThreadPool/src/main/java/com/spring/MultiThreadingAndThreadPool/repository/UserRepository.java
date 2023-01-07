package com.spring.MultiThreadingAndThreadPool.repository;

import com.spring.MultiThreadingAndThreadPool.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
