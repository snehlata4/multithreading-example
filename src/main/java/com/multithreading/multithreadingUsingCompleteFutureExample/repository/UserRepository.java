package com.multithreading.multithreadingUsingCompleteFutureExample.repository;

import com.multithreading.multithreadingUsingCompleteFutureExample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}