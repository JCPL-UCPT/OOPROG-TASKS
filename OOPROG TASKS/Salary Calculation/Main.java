package salary;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter employee name:");

		double baseSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter base salary:"));

		String isManager = JOptionPane.showInputDialog("Is the employee a manager? (yes/no):");

		if (isManager.equalsIgnoreCase("yes")) {
			double bonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus:"));
			Manager m = new Manager(name, baseSalary, bonus);
			JOptionPane.showMessageDialog(null, "Total Salary of Manager " + name + ": " + m.calculateSalary());
		} else {
			Employee e = new Employee(name, baseSalary);
			JOptionPane.showMessageDialog(null, "Total Salary of Employee " + name + ": " + e.calculateSalary());
		}
	}
}