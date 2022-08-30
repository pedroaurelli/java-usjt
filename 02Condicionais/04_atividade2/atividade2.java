import javax.swing.JOptionPane;

// Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
// segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
// operador ternário.

public class atividade2 {
  public static void main (String [] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
    String mensagem;

    if (idade >= 18) {
      mensagem = "Maior de idade";
    } else {
      mensagem = "Menor de idade";
    }

    JOptionPane.showMessageDialog(null, mensagem);
  }
}
