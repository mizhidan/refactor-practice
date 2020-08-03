package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) evenCount++;
        }
        return evenCount;
    }

    public int countOdd() {
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 1) oddCount++;
        }
        return oddCount;
    }

    public int countPositive() {
        int positiveCount = 0;
        for (int number : numbers) {
            if (number >= 0) positiveCount++;
        }
        return positiveCount;
    }

    public int countNegative() {
        int negativeCount = 0;
        for (int number : numbers) {
            if (number < 0) negativeCount++;
        }
        return negativeCount;
    }
}
