import javax.swing.JOptionPane;

public class atividadeTernario {
  public static void main (String [] args) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voce tem?"));

    String maiorDeIdade;
    maiorDeIdade = idade >= 18 ? "Maior de idade" : "Menor de idade";

    JOptionPane.showMessageDialog(null, maiorDeIdade);
  }
}
