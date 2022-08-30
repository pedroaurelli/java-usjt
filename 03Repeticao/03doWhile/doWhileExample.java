import javax.swing.JOptionPane;

public class doWhileExample {
  public static void main (String [] args) {
    double nota1, nota2;
    int count = 1;
    do {
      nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira nota 1"));
      nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira nota 2"));

      System.out.println("Sua media e: " + (nota1 + nota2));

      count = count + 1;

    } while (count <= 5);
  }
}
