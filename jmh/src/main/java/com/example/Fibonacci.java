package com.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static long ZERO = 0L;
    private static long ONE = 1L;

    public static class Recursive {
        public long calculate(long num) {
            if (num == 0L) {
                return Fibonacci.ZERO;
            } else if (num == 1L) {
                return Fibonacci.ONE;
            } else {
                return calculate(num - 1) + calculate(num - 2);
            }
        }
    }

    public static class Memoized {
        private final Map<Long, Long> memo;

        public Memoized() {
            memo = new HashMap<>();
            memo.putIfAbsent(0L, 0L);
            memo.putIfAbsent(1L, 1L);
        }

        /** NOTE: not thread-safe */
        public synchronized long calculate(long num) {
            return memo.computeIfAbsent(num, (new_num) -> {
                long prev2 = calculate(new_num - 2);
                long prev1 = calculate(new_num - 1);
                return prev2 + prev1;
            });
        }

    }
}
