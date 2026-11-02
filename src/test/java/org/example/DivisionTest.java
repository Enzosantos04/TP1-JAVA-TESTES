package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void dividesTwoPositiveNumbers() {
        assertEquals(3.0, calculator.divide(12.0, 4.0), 1e-10);
    }

    @Test
    void divisionPreservesFractionalResult() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 1e-10);
    }

    @Test
    void dividesNumbersWithOppositeSigns() {
        assertEquals(-3.0, calculator.divide(12.0, -4.0), 1e-10);
    }

    @Test
    void dividesTwoNegativeNumbers() {
        assertEquals(3.0, calculator.divide(-12.0, -4.0), 1e-10);
    }

    @Test
    void dividingZeroByNonZeroNumberProducesZero() {
        assertEquals(0.0, calculator.divide(0.0, 4.0), 1e-10);
    }

    @Test
    void rejectsDivisionByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10.0, 0.0));

        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    void rejectsDivisionByNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10.0, -0.0));
    }

    @Test
    void rejectsZeroDividedByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(0.0, 0.0));
    }
}
