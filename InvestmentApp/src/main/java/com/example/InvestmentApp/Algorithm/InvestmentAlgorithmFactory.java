package com.example.InvestmentApp.Algorithm;


import org.springframework.stereotype.Component;

@Component
public class InvestmentAlgorithmFactory {
    public InvestmentAlgorithm createAlgorithm(String type)
    {
        if (InvestmentAlgorithm.TYPE_DAILY == type) {
            return new AlgorithmDaily();
        } else if (InvestmentAlgorithm.TYPE_TOTAL == type) {
            return new AlgorithmTotal();
        }

        return null;
    }
}
