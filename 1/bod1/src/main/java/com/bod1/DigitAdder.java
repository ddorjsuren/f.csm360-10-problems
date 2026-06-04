package com.bod1;

public class DigitAdder {
    private final int number;

    public DigitAdder(int number) {
        this.number = number;
    }
    public int sumDigits() {
        int sum = 0;
        int n = number;
        while (n > 0) {
            sum += n % 10; 
            n /= 10; 
        }
        System.out.println("Sum of digits: " + sum);
        return sum;
    }
}
