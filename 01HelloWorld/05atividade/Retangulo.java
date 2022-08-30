import javax.swing.JOptionPane;

public class Retangulo {
  public static void main (String [] args) {
    double base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));

    double result = base * height; 

    JOptionPane.showMessageDialog(null, result);
  }
}
