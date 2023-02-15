package com.lorraine.project_managment.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String phone;
    private String passWord;
    private String confirmPassWord;
   // private RoleDTO role;
   // private Gender gender;
    private boolean enabled;
}
