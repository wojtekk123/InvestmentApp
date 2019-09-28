package com.example.InvestmentApp.Algorithm;
import org.junit.Assert;
import org.junit.Test;


public class AlgorithmFactoryTest {

    @Test
    public void testCreateDailyAlgorithm()
    {
        InvestmentAlgorithmFactory factory = new InvestmentAlgorithmFactory();

        InvestmentAlgorithm algo = factory.createAlgorithm(InvestmentAlgorithm.TYPE_DAILY);

        Assert.assertTrue(algo instanceof AlgorithmDaily);
    }

    @Test
    public void testCreateTotalAlgorithm()
    {
        InvestmentAlgorithmFactory factory = new InvestmentAlgorithmFactory();

        InvestmentAlgorithm algo = factory.createAlgorithm(InvestmentAlgorithm.TYPE_TOTAL);

        Assert.assertTrue(algo instanceof AlgorithmTotal);
    }

    @Test
    public void testInvalidArgument()
    {
        InvestmentAlgorithmFactory factory = new InvestmentAlgorithmFactory();

        InvestmentAlgorithm algo = factory.createAlgorithm("Test");

        Assert.assertNull(algo);
    }
}
