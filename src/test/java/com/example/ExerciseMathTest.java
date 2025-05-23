package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseMathTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testFactorial1(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class, ()->ExerciseMath.factorial(-1));
        assertEquals("0以下は不正な値です。", expectedException.getMessage(), "TC1:期待された結果と異なります。");
    }

    @Test
    void testFactorial2(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class, ()->ExerciseMath.factorial(0));
        assertEquals("0以下は不正な値です。", expectedException.getMessage(), "TC2:期待された結果と異なります。");
    }

    @Test
    void testFactorial3(){
        int answer = ExerciseMath.factorial(1);
        assertEquals(1, answer, "TC3:期待された結果と異なります。");
    }

    @Test
    void testFactorial4(){
        int answer = ExerciseMath.factorial(2);
        assertEquals(333, answer, "TC4:期待された結果と異なります。");
    }

    @Test
    void testFactorial5(){
        int answer = ExerciseMath.factorial(3);
        assertEquals(6, answer, "TC5:期待された結果と異なります。");
    }

    @Test
    void testFactorial6(){
        int answer = ExerciseMath.factorial(12);
        assertEquals(479001600, answer, "TC6:期待された結果と異なります。");
    }

    @Test
    void testFactorial7(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class, ()->ExerciseMath.factorial(13));

        assertEquals( "13以上は不正な値です。", expectedException.getMessage(), "TC7:期待された結果と異なります。");
    }

    @Test
    void testFactorial8(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class, ()->ExerciseMath.factorial(14));

        assertEquals( "13以上は不正な値です。", expectedException.getMessage(), "TC8:期待された結果と異なります。");
    }

}