package com.jhenaoz.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add3plus5ShouldReturn8() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3,5);
        assertEquals(8, result);
    }
}
