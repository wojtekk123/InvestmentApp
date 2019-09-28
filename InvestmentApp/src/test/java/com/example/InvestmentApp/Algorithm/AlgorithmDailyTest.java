package com.example.InvestmentApp.Algorithm;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class AlgorithmDailyTest {

    @Test
    public void oneTest()
    {
        AlgorithmDaily algo = new AlgorithmDaily();

        double profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 1, 1));
        Assert.assertEquals(0, profit, .5);

        profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 1, 2));
        Assert.assertEquals(277.5, profit, .5);
    }

    @Test
    public void daysBetweenTest()
    {
        Assert.assertEquals(1, this.getDaysBetween(
                LocalDate.of(2010, 1, 1),
                LocalDate.of(2010, 1, 2)
        ));

        Assert.assertEquals(366, this.getDaysBetween(
                LocalDate.of(2010, 1, 1),
                LocalDate.of(2011, 1, 2)
        ));
    }

    protected int getDaysBetween(LocalDate start, LocalDate end)
    {
        return new AlgorithmDaily()
        {
            public int callCalculateDaysBetween(LocalDate start, LocalDate end) {
                return this.calculateDaysBetween(start, end);
            }
        }.callCalculateDaysBetween(start, end);
    }
}
