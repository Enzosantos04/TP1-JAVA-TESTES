package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void raisesBaseToPositiveExponent() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 1e-10);
    }

    @Test
    void raisingNonZeroBaseToZeroProducesOne() {
        assertEquals(1.0, calculator.power(5.0, 0.0), 1e-10);
    }

    @Test
    void raisesBaseToNegativeExponent() {
        assertEquals(0.25, calculator.power(2.0, -2.0), 1e-10);
    }

    @Test
    void raisesBaseToFractionalExponent() {
        assertEquals(3.0, calculator.power(9.0, 0.5), 1e-10);
    }

    @Test
    void raisesNegativeBaseToOddExponent() {
        assertEquals(-8.0, calculator.power(-2.0, 3.0), 1e-10);
    }

    @Test
    void raisesNegativeBaseToEvenExponent() {
        assertEquals(16.0, calculator.power(-2.0, 4.0), 1e-10);
    }

    @Test
    void raisesZeroToPositiveExponent() {
        assertEquals(0.0, calculator.power(0.0, 2.0), 1e-10);
    }
}
