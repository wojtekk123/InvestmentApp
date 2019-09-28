package com.example.InvestmentApp.Dao.Entity;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name="RESULT")

public class Result{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Double amount;
    private Double interest;
    private Double profit;
    private Date calculationDate;


    public Result() {
    }

    public Result(Double amount, Double interest, Double profit, Date calculationDate) {
        this.amount = amount;
        this.interest = interest;
        this.profit = profit;
        this.calculationDate = calculationDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Date getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(Date calculationDate) {
        this.calculationDate = calculationDate;
    }


}
