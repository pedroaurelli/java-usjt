import javax.swing.JOptionPane;

public class PercentualSalario {
  public static void main (String [] args) {
    double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario atual"));

    double porcent = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem de reajuste"));

    double newSalario  = ((salarioAtual * porcent) / 100) + salarioAtual;

    JOptionPane.showMessageDialog(null, newSalario);
  }
}
