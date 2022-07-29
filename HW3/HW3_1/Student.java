package HW3_1;

public class Student {
    private String name;
    private double rating;
    static double avgRating;

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "; Rating: " + this.rating;
    }
}
