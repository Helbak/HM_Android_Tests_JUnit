package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class JustJavaTest {

    @Test
    public void forTest() {
        int input = 2;
        int actual;
        int expected = 4;

        actual = JustJava.forTest(input);
        assertEquals(expected, actual);
    }

    @Test
    public void abTest_2_2() {
        int expected = 4;
        int actual = JustJava.ab(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void abTest_0_2() {
        int expected = 0;
        int actual = JustJava.ab(0, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void abTest_2_0() {
        int expected = 2;
        int actual = JustJava.ab(2, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void abTest_0_0() {
        int expected = 0;
        int actual = JustJava.ab(0, 0);
        assertEquals(expected, actual);
    }


//    @Test
//    public void abTest_test_2() {
//        int expected = 0;
//        int actual = JustJava.ab("2",2);
//        assertEquals(expected, actual);
//    }//    }


    @Test
    public void whereIsPoint_2_2() {
        int expected = 1;
        int actual = JustJava.whereIsPoint(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void whereIsPoint_min2_2() {
        int expected = 4;
        int actual = JustJava.whereIsPoint(-2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void whereIsPoint_2_min2() {
        int expected = 2;
        int actual = JustJava.whereIsPoint(2, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void whereIsPoint_min2_min2() {
        int expected = 3;
        int actual = JustJava.whereIsPoint(-2, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void whereIsPoint_0_0() {
        int expected = 0;
        int actual = JustJava.whereIsPoint(0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOnlyPositive_2_2_2() {
        int expected = 6;
        int actual = JustJava.sumOnlyPositive(2, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOnlyPositive_min2_2_2() {
        int expected = 4;
        int actual = JustJava.sumOnlyPositive(-2, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOnlyPositive_2_min2_2() {
        int expected = 4;
        int actual = JustJava.sumOnlyPositive(2, -2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOnlyPositive_2_2_min2() {
        int expected = 4;
        int actual = JustJava.sumOnlyPositive(2, 2, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOnlyPositive_min2_min2_min2() {
        int expected = 0;
        int actual = JustJava.sumOnlyPositive(-2, -2, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOnlyPositive_a_b_c() {
        int[] mock1 = {1, -5, 50, -100, 1000, -10000};
        int[] mock2 = {10000, 1000, 500, 100, 55, 0};
        int[] mock3 = {-1, 5, -50, 100, -1000, 10000};
        int expected = 0;


        for (int i = 0; i < mock1.length; i++) {
            int input1 = 0;
            int input2 = 0;
            int input3 = 0;
            if (mock1[i] > 0) {
                input1 = mock1[i];
            }
            if (mock2[i] > 0) {
                input2 = mock2[i];
            }
            if (mock3[i] > 0) {
                input3 = mock3[i];
            }
            expected = input1 + input2 + input3;

            int actual = JustJava.sumOnlyPositive(input1, input2, input3);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void sumFromMaxPlus3_2_2_2() {
        int expected = 11;
        int actual = JustJava.sumFromMaxPlus3(2, 2, 2);
        assertEquals(expected, actual);
    }

    public void sumFromMaxPlus3_min2_2_2() {
        int expected = 5;
        int actual = JustJava.sumFromMaxPlus3(-2, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumFromMaxPlus3_2_min2_2() {
        int expected = 5;
        int actual = JustJava.sumFromMaxPlus3(2, -2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void sumFromMaxPlus3_2_2_min2() {
        int expected = 5;
        int actual = JustJava.sumFromMaxPlus3(2, 2, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void scoringOfStudent_0() {
        String expected = " F ";
        String actual = JustJava.scoringOfStudent(0);
        assertEquals(expected, actual);
    }

    @Test
    public void scoringOfStudent_9() {
        String expected = " F ";
        String actual = JustJava.scoringOfStudent(9);
        assertEquals(expected, actual);
    }

    @Test
    public void scoringOfStudent_19() {
        String expected = " F ";
        String actual = JustJava.scoringOfStudent(19);
        assertEquals(expected, actual);
    }

    @Test
    public void scoringOfStudent_20() {
        String expected = " E ";
        String actual = JustJava.scoringOfStudent(20);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_30() {
        String expected = " E ";
        String actual = JustJava.scoringOfStudent(30);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_39() {
        String expected = " E ";
        String actual = JustJava.scoringOfStudent(39);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_40() {
        String expected = " D ";
        String actual = JustJava.scoringOfStudent(40);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_50() {
        String expected = " D ";
        String actual = JustJava.scoringOfStudent(50);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_59() {
        String expected = " D ";
        String actual = JustJava.scoringOfStudent(59);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_60() {
        String expected = " C ";
        String actual = JustJava.scoringOfStudent(60);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_70() {
        String expected = " C ";
        String actual = JustJava.scoringOfStudent(70);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_74() {
        String expected = " C ";
        String actual = JustJava.scoringOfStudent(74);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_75() {
        String expected = " B ";
        String actual = JustJava.scoringOfStudent(75);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_85() {
        String expected = " B ";
        String actual = JustJava.scoringOfStudent(85);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_89() {
        String expected = " B ";
        String actual = JustJava.scoringOfStudent(89);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_90() {
        String expected = " A ";
        String actual = JustJava.scoringOfStudent(90);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_95() {
        String expected = " A ";
        String actual = JustJava.scoringOfStudent(95);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_100() {
        String expected = " A ";
        String actual = JustJava.scoringOfStudent(100);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_min1() {
        String expected = " false ";
        String actual = JustJava.scoringOfStudent(-1);
        assertEquals(expected, actual);
    }
    @Test
    public void scoringOfStudent_101() {
        String expected = " false ";
        String actual = JustJava.scoringOfStudent(101);
        assertEquals(expected, actual);
    }



}