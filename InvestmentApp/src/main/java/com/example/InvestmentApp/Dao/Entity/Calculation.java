package com.example.InvestmentApp.Dao.Entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity ()
@Table(name = "CALCULATION")
@Repository
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;


    private LocalDate CalculationTime;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Investment_id", nullable = false)
    private Investment investment;

    private String algorithm;

    private Double profit;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public LocalDate getCalculationTime() {
        return CalculationTime;
    }

    public void setCalculationTime(LocalDate calculationTime) {
        CalculationTime = calculationTime;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }




}
