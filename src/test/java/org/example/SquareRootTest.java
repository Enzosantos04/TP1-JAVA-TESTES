package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareRootTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void calculatesSquareRootOfPositivePerfectSquare() {
        assertEquals(4.0, calculator.squareRoot(16.0), 1e-10);
    }

    @Test
    void calculatesSquareRootOfNonPerfectSquare() {
        assertEquals(1.4142135623730951, calculator.squareRoot(2.0), 1e-10);
    }

    @Test
    void calculatesSquareRootOfZero() {
        assertEquals(0.0, calculator.squareRoot(0.0), 1e-10);
    }

    @Test
    void calculatesSquareRootOfPositiveFraction() {
        assertEquals(0.5, calculator.squareRoot(0.25), 1e-10);
    }

    @Test
    void rejectsSquareRootOfNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.squareRoot(-4.0));

        assertEquals("Negative number", exception.getMessage());
    }
}
