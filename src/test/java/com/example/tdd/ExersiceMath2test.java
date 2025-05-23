package com.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExersiceMath2test {
    @Test
    void calcFactorial1() {
//        準備
        ExersiceMath2 exersiceMath2 = new ExersiceMath2();
//        実行
        int answer = exersiceMath2.factorial(1);
//        検証
        assertEquals(1,answer, "TC1:期待された結果と異なります");
    }

    @Test
    void calcFactorial2() {
        ExersiceMath2 exersiceMath2 = new ExersiceMath2();
        int answer = exersiceMath2.factorial(2);
        assertEquals(2,answer, "TC2:期待された結果と異なります");
    }

    @Test
    void calcFactorial3() {
        ExersiceMath2 exersiceMath2 = new ExersiceMath2();
        int answer = exersiceMath2.factorial(3);
        assertEquals(6,answer, "TC3:期待された結果と異なります");
    }

    @Test
    void calcFactorial4() {
        ExersiceMath2 exersiceMath2 = new ExersiceMath2();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> exersiceMath2.factorial(13));
        assertEquals("13以上は不正な値です。", exception.getMessage(),"TC4:期待された結果と異なります");
    }

    @Test
    void calcFactorial5() {
        ExersiceMath2 exersiceMath2 = new ExersiceMath2();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> exersiceMath2.factorial(0));
        assertEquals("0以下は不正な値です。", exception.getMessage(),"TC4:期待された結果と異なります");
    }




}
