package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPower1(){
        double answer = MathUtil.power(3,0);
        assertEquals(1,answer, "TC1:期待された結果と異なります");
    }

    @Test
    void testPower2(){
        double answer = MathUtil.power(-2,2);
        assertEquals(4,answer, "TC2:期待された結果と異なります");
    }


    @Test
    void testPower3(){
        double answer = MathUtil.power(0,0);
        assertEquals(1,answer, "TC3:期待された結果と異なります");
    }

    @Test
    void testPower4(){
        double answer = MathUtil.power(0,0);
        assertNotEquals(0,answer,"TC4:期待された結果と異なります");
    }

    @Test
    void testPower5(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.power(100, 0));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC5:期待値と実際の結果が異なります");
    }

    @Test
    void testPower6(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> MathUtil.power(2,100));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC6:期待された結果と異なります");
    }

    @Test
    void testPower7(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class, () -> MathUtil.power(100,100));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC6:期待された結果と異なります");
    }
}