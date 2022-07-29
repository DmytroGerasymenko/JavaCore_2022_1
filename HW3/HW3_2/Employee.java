package HW3_2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static double totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public double getSalary() {
        return this.getRate() * this.getHours();
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "; Rate: " + this.getRate() + "; Hours: " + this.getHours() +
                "; Salary: " + this.getSalary() + "; Bonuses: " + this.getBonuses();
    }

    public void changeRate(int newRate) {
        this.setRate(newRate);
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
}
