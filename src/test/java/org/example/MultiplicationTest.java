package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void multipliesTwoPositiveNumbers() {
        assertEquals(12.0, calculator.multiply(3.0, 4.0), 1e-10);
    }

    @Test
    void multipliesNumbersWithOppositeSigns() {
        assertEquals(-12.0, calculator.multiply(-3.0, 4.0), 1e-10);
    }

    @Test
    void multiplyingTwoNegativeNumbersProducesPositiveResult() {
        assertEquals(12.0, calculator.multiply(-3.0, -4.0), 1e-10);
    }

    @Test
    void multiplyingByZeroProducesZero() {
        assertEquals(0.0, calculator.multiply(7.0, 0.0), 1e-10);
    }

    @Test
    void multipliesDecimalNumbers() {
        assertEquals(0.1, calculator.multiply(0.5, 0.2), 1e-10);
    }
}
