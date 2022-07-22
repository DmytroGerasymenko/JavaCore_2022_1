import java.util.Scanner;

public class HW2_1 {

    public static void main(String[] args) {
        System.out.print("Please enter a number of minutes: ");
        Scanner scan = new Scanner(System.in);
        int minute = scan.nextInt();
        scan.close();
        if (minute % 5 <= 3) {
            System.out.printf("The color at the %d minute is green", minute);
        } else {
            System.out.printf("The color at the %d minute is red", minute);
        }
    }
}
