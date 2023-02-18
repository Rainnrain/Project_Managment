package com.lorraine.project_management.service;

import com.lorraine.project_management.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> listAllUsers();
}
