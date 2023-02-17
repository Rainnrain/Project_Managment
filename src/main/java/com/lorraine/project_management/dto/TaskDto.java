package com.lorraine.project_management.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lorraine.project_management.enums.Status;

import java.time.LocalDate;

public class TaskDto {
    private Long id;


    private ProjectDto project;


    private UserDto assignedEmployee;


    private String taskSubject;


    private String taskDetail;

    @JsonProperty(access=JsonProperty.Access.READ_ONLY)
    private Status taskStatus;

    @JsonProperty(access=JsonProperty.Access.READ_ONLY)
    private LocalDate assignedDate;
}
