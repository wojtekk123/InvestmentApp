package com.example.InvestmentApp.Algorithm;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class InvestmentAlgorithm {
    public static final String TYPE_DAILY = "DAILY";
    public static final String TYPE_TOTAL = "TOTAL";

    protected int calculateDaysBetween(LocalDate validFrom, LocalDate validTo)
    {
        final int between = (int) ChronoUnit.DAYS.between(validFrom, validTo);
        return between;
    }

    abstract public double calculateProfit(double percentAnnual, double amount, LocalDate validFrom, LocalDate validTo);
}
