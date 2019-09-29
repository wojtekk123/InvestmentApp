package com.example.InvestmentApp.Menager;


import com.example.InvestmentApp.Dao.Entity.Result;
import com.example.InvestmentApp.Dao.ResultRepo;
import com.example.InvestmentApp.Algorithm.InvestmentAlgorithm;
import com.example.InvestmentApp.Algorithm.InvestmentAlgorithmFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.InvestmentApp.Dao.Entity.Investment;

import java.time.LocalDate;
import java.util.Date;


@Service
public class ResultManager {



    @Autowired
    private InvestmentAlgorithmFactory factory;
    @Autowired
    private InvestmentManager investmentManager;
    @Autowired
    ResultRepo resultRepo;


    public Result save(Result result){
        return resultRepo.save(result);
    }


    public Result calculate(Long investmentId, Double amount, String algorithmType) {

        Investment countedInvestment = investmentManager.findById(investmentId).get();
        Double annualInterest = countedInvestment.getInterest();
        LocalDate validForm = countedInvestment.getValidFrom();
        LocalDate validTo = countedInvestment.getValidTo();

        Date currentDate = new Date();


        InvestmentAlgorithm algorithm = factory.createAlgorithm(algorithmType);

        if (algorithm == null) {
            throw  new NullPointerException();
        }
        Double profit = algorithm.calculateProfit(annualInterest,amount,validForm,validTo);

        Result result = new Result(amount,annualInterest,profit,currentDate);

        save(result);

        return result;
    }
}

