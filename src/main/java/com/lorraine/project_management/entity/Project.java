package com.lorraine.project_management.entity;

import com.lorraine.project_management.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity{

   // @Column(unique=true)
    private String ProjectCode;

    private String projectName;
   //@Column(columnDefinition = "DATE")
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetail;
    @ManyToOne(fetch=FetchType.LAZY)
    private User assignedManager;

}
