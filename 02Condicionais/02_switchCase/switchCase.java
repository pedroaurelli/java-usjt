import javax.swing.JOptionPane;

public class switchCase {
  public static void main (String [] args) {
    int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a nota"));

    switch (nota) {
      case 10:
        JOptionPane.showMessageDialog(null, "Conceito A"); 
        break;
      case 9: 
        JOptionPane.showMessageDialog(null, "Conceito B"); 
        break;
      case 8: 
        JOptionPane.showMessageDialog(null, "Conceito C"); 
        break;
      default: 
        JOptionPane.showMessageDialog(null, "Reprovado"); 
        break;
    }
  }
}
