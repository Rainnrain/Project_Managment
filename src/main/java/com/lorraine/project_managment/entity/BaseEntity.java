package com.lorraine.project_managment.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
@MappedSuperclass
public class BaseEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private LocalDate lastUpdated;
    private LocalDate firstInserted;

}
