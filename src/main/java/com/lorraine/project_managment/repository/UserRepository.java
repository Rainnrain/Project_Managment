package com.lorraine.project_managment.repository;

import com.lorraine.project_managment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
