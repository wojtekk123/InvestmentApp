package com.example.InvestmentApp.Dao.Entity;


import org.springframework.stereotype.Repository;

@Repository
public class DataToSend {

    private Double amount;
    private String typeAlgorithm;

    public DataToSend (){

    }
    public DataToSend(Double amount, String typeAlgorithm) {
        this.amount = amount;
        this.typeAlgorithm = typeAlgorithm;
    }



    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTypeAlgorithm() {
        return typeAlgorithm;
    }

    public void setTypeAlgorithm(String typeAlgorithm) {
        this.typeAlgorithm = typeAlgorithm;
    }
}
