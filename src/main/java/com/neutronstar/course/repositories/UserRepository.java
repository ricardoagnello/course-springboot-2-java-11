package com.neutronstar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neutronstar.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
