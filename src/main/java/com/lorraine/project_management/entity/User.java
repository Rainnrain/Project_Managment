package com.lorraine.project_management.entity;

import com.lorraine.project_management.enums.Gender;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity{
    private String firstName;
    private String lastName;

    //@Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String passWord;

    private boolean enabled;
    private String phone;

    @ManyToOne
  @JoinColumn(name = "role_id")
    private Role role;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
