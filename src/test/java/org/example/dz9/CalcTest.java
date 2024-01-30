package org.example.dz9;

import org.example.dz9.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sum() {
        Calc c = new Calc();
        double res = c.sum(1, 1);
        assertEquals(2, res);
    }

    @Test
    void sub() {
        Calc c = new Calc();
        double res = c.sub(1, 1);
        assertEquals(0, res);
    }

    @Test
    void mul() {
        Calc c = new Calc();
        double res = c.mul(1, 1);
        assertEquals(1, res);
    }

    @Test
    void div() {
        Calc c = new Calc();
        double res = c.div(1, 1);
        assertEquals(1, res);
    }
}