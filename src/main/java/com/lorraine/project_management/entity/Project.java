package com.lorraine.project_management.entity;

import com.lorraine.project_management.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name="projects")
public class Project extends BaseEntity{

   // @Column(unique=true)
    private String ProjectCode;

    private String projectName;
    private String projectDetail;
    @Enumerated(EnumType.STRING)
    private Status projectStatus;
   //@Column(columnDefinition = "DATE")
    private LocalDate startDate;
    private LocalDate endDate;



    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="manager_id")
    private User assignedManager;

}
