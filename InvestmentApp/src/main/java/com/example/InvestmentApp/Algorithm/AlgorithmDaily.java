package com.example.InvestmentApp.Algorithm;

import java.time.LocalDate;

public class AlgorithmDaily extends InvestmentAlgorithm
{
    private double percentAnnual;
    private double initialAmount;

    @Override
    public double calculateProfit(double percentAnnual, double amount, LocalDate validFrom, LocalDate validTo)
    {
        this.percentAnnual = percentAnnual;
        this.initialAmount = amount;

        int days = this.calculateDaysBetween(validFrom, validTo);

        return this.getProfit(days);
    }

    private double getProfit(int days)
    {
        double amount = this.initialAmount;

        for (int currentDay=0; currentDay<days; currentDay++)
        {
            amount += (amount * (percentAnnual / 100)) / 360;
        }

        return amount - initialAmount;
    }
}
