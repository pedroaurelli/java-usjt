import javax.swing.JOptionPane;

public class ValorAnterior {
  public static void main (String [] args) {
    double value = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor"));
  
    double result = value - 1;
  
    JOptionPane.showMessageDialog(null, result);
  }
}
