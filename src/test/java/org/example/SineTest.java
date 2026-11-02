package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SineTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void sineOfZeroDegreesIsZero() {
        assertEquals(0.0, calculator.sin(0.0), 1e-10);
    }

    @Test
    void calculatesSineOfThirtyDegrees() {
        assertEquals(0.5, calculator.sin(30.0), 1e-10);
    }

    @Test
    void sineOfNinetyDegreesIsOne() {
        assertEquals(1.0, calculator.sin(90.0), 1e-10);
    }

    @Test
    void sineOfOneHundredEightyDegreesIsZero() {
        assertEquals(0.0, calculator.sin(180.0), 1e-10);
    }

    @Test
    void sineOfTwoHundredSeventyDegreesIsNegativeOne() {
        assertEquals(-1.0, calculator.sin(270.0), 1e-10);
    }

    @Test
    void calculatesSineOfNegativeAngle() {
        assertEquals(-0.5, calculator.sin(-30.0), 1e-10);
    }

    @Test
    void sineRepeatsAfterFullTurn() {
        assertEquals(0.5, calculator.sin(390.0), 1e-10);
    }
}
