package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LogarithmTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void calculatesNaturalLogarithmOfEulerNumber() {
        assertEquals(1.0, calculator.log(Math.E), 1e-10);
    }

    @Test
    void naturalLogarithmOfOneIsZero() {
        assertEquals(0.0, calculator.log(1.0), 1e-10);
    }

    @Test
    void calculatesNaturalLogarithmOfPositiveNumber() {
        assertEquals(2.302585092994046, calculator.log(10.0), 1e-10);
    }

    @Test
    void naturalLogarithmOfPositiveFractionIsNegative() {
        assertEquals(-0.6931471805599453, calculator.log(0.5), 1e-10);
    }

    @Test
    void rejectsLogarithmOfZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.log(0.0));

        assertEquals("Log of non-positive number", exception.getMessage());
    }

    @Test
    void rejectsLogarithmOfNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.log(-1.0));

        assertEquals("Log of non-positive number", exception.getMessage());
    }
}
