package shopping;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter product name:");

        double price = Double.parseDouble(
            JOptionPane.showInputDialog("Enter price:")
        );

        String type = JOptionPane.showInputDialog("Enter product type (electronics/clothes):");

        if (type.equalsIgnoreCase("electronics")) {
            double warranty = Double.parseDouble(
                JOptionPane.showInputDialog("Enter warranty fee:")
            );
            Electronics e = new Electronics(name, price, warranty);
            JOptionPane.showMessageDialog(null,
                "Final price of electronic: " + e.calculatePrice());
        } else {
            double discount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter discount:")
            );
            Clothes c = new Clothes(name, price, discount);
            JOptionPane.showMessageDialog(null,
                "Final price of clothes: " + c.calculatePrice());
        }
    }
}