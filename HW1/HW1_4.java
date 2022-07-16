package com.edu;

public class HW1_4 {

    public static void main(String[] args) {
        int number = 8;
        int factorial = 1;
        int fact4 = 0;
        int fact5 = 0;
        int fact6 = 0;
        int fact8 = 0;
        for (int i = 1; i <= number; ++i)
        {
            factorial *= i;
            switch (i) {
                case (4): fact4 = factorial;
                case (5): fact5 = factorial;
                case (6): fact6 = factorial;
                case (8): fact8 = factorial;
            }
        }
        float result = (float) (2 * fact5 + 3 * fact8) / (fact6 + fact4);
        System.out.println("The result is " + result);
    }
}
