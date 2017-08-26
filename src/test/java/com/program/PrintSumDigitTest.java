package com.program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintSumDigitTest {
    @Test
    public void testSumDigit() {
        PrintSumDigit obj = new PrintSumDigit();
        long sum = obj.sum(123);
        Assert.assertEquals(sum, 6);
    }
}
