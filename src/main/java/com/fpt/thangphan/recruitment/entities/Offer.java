package com.fpt.thangphan.recruitment.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author thangphan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;

    @Column(name = "offer_contract_period_from")
    private LocalDate offerContractPeriodFrom;

    @Column(name = "offer_contract_period_to")
    private LocalDate offerContractPeriodTo;

    @Column(name = "offer_note")
    private String offerNote;

    @Column(name = "offer_basic_salary")
    private BigDecimal offerBasicSalary;

    @Column(name = "offer_due_date")
    private LocalDate offerDueDate;

    @Column(name = "offer_contract")
    private String offerContract;

    @Column(name = "offer_candidate_position")
    private String candidatePosition;

    @Column(name = "offer_level")
    private String jobOfferLevel;
}