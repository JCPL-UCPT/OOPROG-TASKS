package salary2;

class Salary extends Employee {
    double basicSalary;
    double hra;

    Salary(String name, int empId, double basicSalary) {
        super(name, empId);
        this.basicSalary = basicSalary;
        this.hra = basicSalary * 0.20; // 20% of Basic Salary
    }

    double calculateTotalSalary() {
        return basicSalary + hra;
    }

    String display() {
        return "Name: " + name +
               "\nEmployee ID: " + empId +
               "\nBasic Salary: " + basicSalary +
               "\nHRA: " + hra +
               "\nTotal Salary: " + calculateTotalSalary();
    }
}