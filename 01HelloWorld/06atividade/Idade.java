import javax.swing.JOptionPane;

public class Idade {
  public static void main (String [] args) {
    double age = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
    double months = Integer.parseInt(JOptionPane.showInputDialog("Insira seu mes"));
    double dias = Integer.parseInt(JOptionPane.showInputDialog("Insira os dias"));

    double parseAgeToDays = age * 365;
    double parseMothsToDays = 

    double result = age * 365;

    JOptionPane.showMessageDialog(null, "Voce possui " + parseMonthsToDays + " dias vividos!");
  }
}
