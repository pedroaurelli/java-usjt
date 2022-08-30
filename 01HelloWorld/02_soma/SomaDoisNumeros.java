// Importando classes default
import javax.swing.JOptionPane;

public class SomaDoisNumeros {
  static public void main (String x []) {
    //1 - Declaração de variáveis
    double firstValue;
    double secondValue;
    double result;

    //2 - Entrada de dados

    // = É UMA ATRIBUIÇÃO!
    firstValue = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
    secondValue = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

    //3 - Processamento
    result = firstValue + secondValue;

    //4 - Saída
    JOptionPane.showMessageDialog(parentComponent, message);;
  }
}
