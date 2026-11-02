package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void addsTwoPositiveNumbers() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 1e-10);
    }

    @Test
    void addsTwoNegativeNumbers() {
        assertEquals(-5.0, calculator.add(-2.0, -3.0), 1e-10);
    }

    @Test
    void addsNumbersWithOppositeSigns() {
        assertEquals(1.0, calculator.add(-2.0, 3.0), 1e-10);
    }

    @Test
    void addingZeroPreservesNumber() {
        assertEquals(7.0, calculator.add(7.0, 0.0), 1e-10);
    }

    @Test
    void addsDecimalNumbers() {
        assertEquals(0.3, calculator.add(0.1, 0.2), 1e-10);
    }
}
