package com.example.InvestmentApp.Algorithm;


import com.example.InvestmentApp.Dao.Entity.Investment;
import org.springframework.stereotype.Component;

@Component
public class InvestmentAlgorithmFactory {
    public InvestmentAlgorithm createAlgorithm(String type)
    {
        if (InvestmentAlgorithm.TYPE_DAILY.equals(type)) {
            System.out.println(type+"TYPE 2");
            return new AlgorithmDaily();
        } else if (InvestmentAlgorithm.TYPE_TOTAL.equals(type)) {
            return new AlgorithmTotal();
        }
return null;

    }
}
