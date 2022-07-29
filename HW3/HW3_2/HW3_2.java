package HW3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        int totalSalary = 0;
        double totalBonuses = 0;
        ArrayList<Employee> employees = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        for (int i=0; i < 3; i++) {
            System.out.printf("Please enter a Name of the Employee %s: ", i + 1);
            String name = scan.next();
            System.out.printf("Please enter a Rate of the Employee %s: ", i + 1);
            int rate = scan.nextInt();
            System.out.printf("Please enter number of Hours for the Employee %s: ", i + 1);
            int hours = scan.nextInt();
            employees.add(new Employee(name, rate, hours));
        }
        scan.close();

        System.out.println("");
        for (Employee employee: employees) {
            System.out.println(employee);
            totalSalary += employee.getSalary();
            totalBonuses += employee.getBonuses();
        }
        System.out.printf("\nThe total salary of all employees is %d (plus %.2f bonuses)", totalSalary, totalBonuses);
    }
}
