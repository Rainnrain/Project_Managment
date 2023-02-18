package com.lorraine.project_management.dto;

import com.lorraine.project_management.enums.Status;


import java.time.LocalDate;

public class ProjectDto {
    private Long id;


    private String projectName;


    private String projectCode;


    private UserDto assignedManager;


    private LocalDate startDate;


    private LocalDate endDate;


    private String projectDetail;

    private Status projectStatus;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;
}
