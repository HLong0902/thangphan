package com.fpt.thangphan.recruitment.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 *
 * @author thangphan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "Job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "job_start_date")
    private LocalDate jobStartDate;

    @Column(name = "job_end_date")
    private LocalDate jobEndDate;

    @Column(name = "job_salary_range_from")
    private double jobSalaryRangeFrom;

    @Column(name = "job_salary_range_to")
    private double jobSalaryRangeTo;

    @Column(name = "job_working_address")
    private String jobWorkingAddress;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "job_required_skills")
    private String jobRequiredSkills;

    @Column(name = "job_status")
    private String jobStatus;
}
