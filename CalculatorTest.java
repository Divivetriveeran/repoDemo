package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test void add_works() {
        assertEquals(8, Addition.add(5,3));
    }
    @Test void sub_works() {
        assertEquals(2, Subtraction.sub(5,3));
    }
}
