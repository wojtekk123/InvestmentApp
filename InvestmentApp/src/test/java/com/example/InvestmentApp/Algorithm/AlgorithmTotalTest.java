package com.example.InvestmentApp.Algorithm;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class AlgorithmTotalTest {

    @Test
    public void testInvalidRange()
    {
        AlgorithmTotal algo = new AlgorithmTotal();

        double profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 1, 1));
        Assert.assertEquals(0, profit, .5);
    }

    @Test
    public void testMultiple()
    {
        AlgorithmTotal algo = new AlgorithmTotal();

        double profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 3, 2));
        Assert.assertEquals(17361, profit, .5);

        profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 4, 2));
        Assert.assertEquals(26388.5, profit, .5);

        profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 5, 2));
        Assert.assertEquals(36921, profit, .5);

        profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2001, 7, 2));
        Assert.assertEquals(57986, profit, .5);

        profit = algo.calculateProfit(100, 100000, LocalDate.of(2001, 1, 1),LocalDate.of(2002, 1, 2));
        Assert.assertEquals(136979, profit, .5);
    }
}
