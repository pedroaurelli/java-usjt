import javax.swing.JOptionPane;

public class ConvertYearsToMonths {
  public static void main (String [] args) {
    int age = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
    int months = age * 12;
    int days = months * 30;

    JOptionPane.showMessageDialog(null, "Sua idade: " + age + ", meses: " + months + ", dias: " + days);
  }
}