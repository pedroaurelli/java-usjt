import javax.swing.JOptionPane;

public class forExample {
  public static void main (String [] args) {
    double nota1, nota2;

    for (int count = 1; count <= 10; count++) {
      nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1"));
      nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2"));

      System.out.println("Sua media e: " + (nota1 / nota2));
    }
  }
}
