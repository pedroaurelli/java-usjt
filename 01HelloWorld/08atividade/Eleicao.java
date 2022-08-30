import javax.swing.JOptionPane;

public class Eleicao {
  public static void main (String [] args) {
    int totalEleitors = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de eleitores"));
    int validVotes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de votos"));
    int nullableVotes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de votos nulos"));
    int whiteVotes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de votos brancos"));

    double percentValidVotes = (validVotes * 100) / totalEleitors;
    double percentNullableVotes = (nullableVotes * 100) / totalEleitors;
    double percentWhiteVoter = (whiteVotes * 100) / totalEleitors;

    JOptionPane.showMessageDialog(null, "percentual de votos validos: " + percentValidVotes);
    JOptionPane.showMessageDialog(null, "percentual de votos nulos: " + percentNullableVotes);
    JOptionPane.showMessageDialog(null, "percentual de votos em branco: " + percentWhiteVoter);
  }
}
