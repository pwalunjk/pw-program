package com.program;

import java.util.Scanner;

public class PrintSumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        long nextLine = scanner.nextLong();
        // System.out.println(nextLine);

        PrintSumDigit obj = new PrintSumDigit();
        long sum = obj.sum(nextLine);
        System.out.println(" Sum of dight " + sum);

    }

    public long sum(long number) {
        long sum = number % 10; // (modules) get the reminder by dividing 10
        long divbyTen = number / 10; // get the quotient
        if (divbyTen > 0) {
            sum = sum + sum(divbyTen);
        }
        return sum;

    }
}
