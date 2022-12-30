package com.hillel.zasiedko.homeworks.homework16;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.hillel.zasiedko.homeworks.homeworks16.ArrayUtil.getAverageOfArraysElements;
import static com.hillel.zasiedko.homeworks.homeworks16.ArrayUtil.ArraySquare;
import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtil {
    static int[] arrayTest;

    @BeforeAll
    static void beforeAll() {
        arrayTest = new int[]{6, 6, 6, 6, 6, 6};
    }

    @Test
    public void test1() {
        assertFalse(ArraySquare(null));
    }

    @Test
    public void test2() {
        assertFalse(ArraySquare(new int[0][0]));
    }

    @Test
    public void test3() {
        assertTrue(ArraySquare(new int[6][6]));
    }

    @Test
    public void test4() {
        double average = getAverageOfArraysElements(new int[]{});
        assertEquals(0.0, average);
    }

    @Test
    public void test5() {
        double average = getAverageOfArraysElements(null);
        assertEquals(0.0, average);
    }

    @Test
    public void test6() {
        double average = getAverageOfArraysElements(arrayTest);
        assertEquals(6.0, average);
    }
}
