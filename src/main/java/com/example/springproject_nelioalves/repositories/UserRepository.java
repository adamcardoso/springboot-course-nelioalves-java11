package com.example.springproject_nelioalves.repositories;

import com.example.springproject_nelioalves.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
