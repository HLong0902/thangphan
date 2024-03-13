package com.fpt.thangphan.recruitment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author thangphan
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Interviews")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interviewID;
    @Column
    private String interviewScheduleTitle;
    @Column
    private LocalDate interviewSchedule;
    @Column(name = "interview_schedule_from")
    private Time interviewScheduleFrom;

    @Column(name = "interview_schedule_to")
    private Time interviewScheduleTo;

    @Column(name = "interview_location")
    private String interviewLocation;

    @Column(name = "interview_meetingid")
    private String interviewMeetingId;

    @Column(name = "interview_note")
    private String interviewNote;

    @Column(name = "interview_result")
    private String interviewResult;
}