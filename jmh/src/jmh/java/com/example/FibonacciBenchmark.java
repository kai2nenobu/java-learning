package com.example;

import org.openjdk.jmh.annotations.Benchmark;

public class FibonacciBenchmark {

    @Benchmark
    public void benchmark() {
        System.out.println("hoge");
    }

}
