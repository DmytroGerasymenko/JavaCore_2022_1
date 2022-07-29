package HW3_1;

import java.util.ArrayList;

public class HW3_1 {
    public static void main(String[] args) {
        double totalRating = 0;
        double bestRating = 0;
        int bestIndex = 0;
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Denis", 135));
        students.add(new Student("Olena", 270));
        students.add(new Student("Dmytro", 19));

        for (Student student: students) {
            System.out.println(student);
            totalRating += student.getRating();
            if (student.getRating() > bestRating) {
                bestRating = student.getRating();
                bestIndex = students.indexOf(student);
            }
        }
        Student.avgRating = totalRating / students.size();

        System.out.printf("The total rating is %.2f\n", totalRating);
        System.out.printf("The average rating is %.2f\n", Student.avgRating);
        System.out.printf("The best student is %s (Rating %.2f)", students.get(bestIndex).getName(),
                students.get(bestIndex).getRating());
    }
}
