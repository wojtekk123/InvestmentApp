package com.example.InvestmentApp.Algorithm;

import java.time.LocalDate;

public class AlgorithmTotal extends InvestmentAlgorithm
{
    private double annualInterest;
    private double initialAmount;

    @Override
    public double calculateProfit(double annualInterest, double amount, LocalDate validFrom, LocalDate validTo)
    {
        this.annualInterest = annualInterest;
        this.initialAmount = amount;

        int days = this.calculateDaysBetween(validFrom, validTo);

        return this.getProfit(days);
    }

    private double getProfit(int days)
    {
        int months = days / 30;


        if (months < 1) {
            return 0;
        }

        double amount = this.initialAmount;
        int lastIncrMonth = 0;
        for (int currentMonth=1; currentMonth <= months && currentMonth <= 12; currentMonth++)
        {
            if (currentMonth == 1 || currentMonth == 3 || currentMonth == 6 || currentMonth == 12) {
                amount += (amount * (this.annualInterest / 100)) * ((double)(currentMonth - lastIncrMonth) / 12);
                lastIncrMonth = currentMonth;
            }
        }

        if (months != 1 && months != 3 && months != 6 && months != 12) {
            amount += (amount * (this.annualInterest / 100)) * ((double)(months - lastIncrMonth) / 12);
        }

        return amount - initialAmount;
    }
}
