import java.util.Scanner;

public class HW2_2 {

    public static void main(String[] args) {
        System.out.print("Please enter an integer number: ");
        Scanner scan = new Scanner(System.in);
        int number_original = scan.nextInt();
        scan.close();

        int number = number_original;
        int counter = 0;
        int more_than_4_number = 0;
        int reverse_number = 0;
        while (number != 0) {
            if (number % 10 > 4) {
                more_than_4_number += 1;
            }
            reverse_number = reverse_number * 10 + (number % 10);
            number /= 10;
            counter++;
        }

        System.out.printf("The number of digits in the entered number is %d\n", counter);
        if (more_than_4_number > 0) {
            System.out.println("The entered number includes digit(s) more than 4");
        } else {
            System.out.println("The entered number does not include any digit(s) more than 4");
        }
        System.out.printf("The entered number in reversal order is %d\n", reverse_number);
    }
}
