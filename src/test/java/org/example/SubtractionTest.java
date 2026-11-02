package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void subtractsSmallerNumberFromLargerNumber() {
        double minuend = 10.0;
        double subtrahend = 4.0;

        double result = calculator.subtract(minuend, subtrahend);

        assertEquals(6.0, result, 1e-10);
    }

    @Test
    void subtractingLargerNumberProducesNegativeResult() {
        assertEquals(-6.0, calculator.subtract(4.0, 10.0), 1e-10);
    }

    @Test
    void subtractsNegativeNumber() {
        assertEquals(7.0, calculator.subtract(4.0, -3.0), 1e-10);
    }

    @Test
    void subtractingEqualNumbersProducesZero() {
        assertEquals(0.0, calculator.subtract(4.0, 4.0), 1e-10);
    }

    @Test
    void subtractsDecimalNumbers() {
        assertEquals(0.1, calculator.subtract(0.3, 0.2), 1e-10);
    }
}
