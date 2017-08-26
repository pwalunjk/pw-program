package com.program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintNumberToWordTest {

    @Test
    public void testNumber() {
        PrintNumberToWord obj = new PrintNumberToWord();
        String str = obj.printNumber(10705);
        Assert.assertEquals(str, "Ten thousand Seven hundred Five");
    }
}
