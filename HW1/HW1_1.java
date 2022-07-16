package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the 1st number (a): ");
        int number1st = Integer.parseInt(br.readLine());
        System.out.print("Please enter the 1st number (b): ");
        int number2nd = Integer.parseInt(br.readLine());
        System.out.println("Calculation results:");
        System.out.printf("a + b = %d\n", number1st + number2nd);
        System.out.printf("a - b = %d\n", number1st - number2nd);
        System.out.printf("a * b = %d\n", number1st * number2nd);
        System.out.printf("a / b = %d\n", number1st / number2nd);
    }
}
