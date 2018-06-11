package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Nested
    class Recursive {
        Fibonacci.Recursive sut;

        @BeforeEach
        void setUp() {
            sut = new Fibonacci.Recursive();
        }

        @Test
        void test_0() {
            long actual = sut.calculate(0L);
            assertEquals(0L, actual);
        }

        @Test
        void test_1() {
            long actual = sut.calculate(1L);
            assertEquals(1L, actual);
        }

        @Test
        void test_2() {
            long actual = sut.calculate(2L);
            assertEquals(1L, actual);
        }

        @Test
        void test_5() {
            long actual = sut.calculate(5L);
            assertEquals(5L, actual);
        }

        @Test
        void test_10() {
            long actual = sut.calculate(10L);
            assertEquals(55L, actual);
        }

        @Test
        void test_40() {
            long actual = sut.calculate(40L);
            assertEquals(102334155L, actual);
        }

    }

    @Nested
    class Memoized {
        Fibonacci.Memoized sut;

        @BeforeEach
        void setUp() {
            sut = new Fibonacci.Memoized();
        }

        @Test
        void test_0() {
            long actual = sut.calculate(0L);
            assertEquals(0L, actual);
        }

        @Test
        void test_1() {
            long actual = sut.calculate(1L);
            assertEquals(1L, actual);
        }

        @Test
        void test_2() {
            long actual = sut.calculate(2L);
            assertEquals(1L, actual);
        }

        @Test
        void test_5() {
            long actual = sut.calculate(5L);
            assertEquals(5L, actual);
        }

        @Test
        void test_10() {
            long actual = sut.calculate(10L);
            assertEquals(55L, actual);
        }

        @Test
        void test_40() {
            long actual = sut.calculate(40L);
            assertEquals(102334155L, actual);
        }

    }

}
