import javax.swing.JOptionPane;

// Ler 4 números, calcular o quadrado para cada um, 
// somar todos os quadrados e mostrar o resultado.

public class SomaQuadrados {
  public static void main (String [] args) {
    double valor1 = Math.sqrt(Integer.parseInt(JOptionPane.showInputDialog("Informar valor 1")));
    double valor2 = Math.sqrt(Integer.parseInt(JOptionPane.showInputDialog("Informar valor 2")));
    double valor3 = Math.sqrt(Integer.parseInt(JOptionPane.showInputDialog("Informar valor 3")));
    double valor4 = Math.sqrt(Integer.parseInt(JOptionPane.showInputDialog("Informar valor 4")));

    double result = valor1 + valor2 + valor3 + valor4;
    
    System.out.println(result);
  }
}