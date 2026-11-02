package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CosineTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    void cosineOfZeroDegreesIsOne() {
        assertEquals(1.0, calculator.cos(0.0), 1e-10);
    }

    @Test
    void calculatesCosineOfSixtyDegrees() {
        assertEquals(0.5, calculator.cos(60.0), 1e-10);
    }

    @Test
    void cosineOfNinetyDegreesIsZero() {
        assertEquals(0.0, calculator.cos(90.0), 1e-10);
    }

    @Test
    void cosineOfOneHundredEightyDegreesIsNegativeOne() {
        assertEquals(-1.0, calculator.cos(180.0), 1e-10);
    }

    @Test
    void cosineOfTwoHundredSeventyDegreesIsZero() {
        assertEquals(0.0, calculator.cos(270.0), 1e-10);
    }

    @Test
    void calculatesCosineOfNegativeAngle() {
        assertEquals(0.5, calculator.cos(-60.0), 1e-10);
    }

    @Test
    void cosineRepeatsAfterFullTurn() {
        assertEquals(0.5, calculator.cos(420.0), 1e-10);
    }
}
