package com.lorraine.project_managment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class User extends BaseEntity{
    @Column(unique = true)
    private String username;

    private String password;

    private String firstname;

    private String lastname;

    private String phone;

    private boolean enabled;

   // @ManyToOne
   // private Role role;

  //  @ManyToOne
   // private Company company;

}
