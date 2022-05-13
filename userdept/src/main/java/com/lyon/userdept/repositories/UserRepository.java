package com.lyon.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyon.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
