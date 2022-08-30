import javax.swing.JOptionPane;

// 1. Escreva um programa que obtém o salário de uma pessoa 
// e diz se ela está ganhando pelo menos o salário mínimo.

public class atividade1 {
  public static void main (String [] args) {
    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a mensagem"));
  
    if (salario == 1212.00) {
      JOptionPane.showMessageDialog(null, "Salario é igual ao salario minimo");
    } else if (salario >= 1212.00) {
      JOptionPane.showMessageDialog(null, "Salario é maior que o salario minimo");
    } else {
      JOptionPane.showMessageDialog(null, "Salario é menor que o salario minimo");
    }
  }
}
