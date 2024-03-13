package com.fpt.thangphan.recruitment.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

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
@Table(name = "Candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidateId;

    @Nationalized
    @Column(name = "candidate_fullname", length = 100)
    private String candidateFullName;

    @Column(name = "candidate_email", length = 100)
    private String candidateEmail;

    @Column(name = "candidate_year_of_experience")
    private Long candidateYearOfExperience;

    @Column(name = "candidate_phonenumber", length = 20)
    private String candidatePhonenumber;

    @Column(name = "candidate_dob")
    private LocalDate candidateDob;

    @Nationalized
    @Column(name = "candidate_cv_attachment", length = 100)
    private String candidateCvAttachment;

    @Column(name = "candidate_address")
    private String candidateAddress;

    @Column(name = "candidate_gender")
    private String candidateGender;

    @Column(name = "candidate_note")
    private String candidateNote;

    @Column(name = "candidate_status")
    private String candidateStatus;

    @Column(name = "candidate_highest_level")
    private String candidateHighestLevel;
}
