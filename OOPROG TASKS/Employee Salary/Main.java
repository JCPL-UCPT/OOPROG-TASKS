package salary2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Name:");

        int empId = Integer.parseInt(
            JOptionPane.showInputDialog("Enter Employee ID:")
        );

        double basicSalary = Double.parseDouble(
            JOptionPane.showInputDialog("Enter Basic Salary:")
        );

        Salary s = new Salary(name, empId, basicSalary);
        JOptionPane.showMessageDialog(null, s.display());
    }
}