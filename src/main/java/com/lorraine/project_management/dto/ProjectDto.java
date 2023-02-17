package com.lorraine.project_management.dto;

import com.lorraine.project_management.enums.Status;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ProjectDto {
    private Long id;


    private String projectName;


    private String projectCode;


    private UserDto assignedManager;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;


    private String projectDetail;

    private Status projectStatus;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;
}
