import javax.swing.JOptionPane;

public class AulaUm {
    public static void main (String [] args) {
        String dolarValue = JOptionPane.showInputDialog("Informar valor do dolar");
        double parseValueToDouble = Double.parseDouble(dolarValue);

        String dolarMount = JOptionPane.showInputDialog("Informar a quantidade de dolar");
        double parseDolarMoutToDouble = Integer.parseInt(dolarMount);

        double result = parseDolarMoutToDouble * parseValueToDouble;

        JOptionPane.showMessageDialog(null, "Voce possui: " + result + " dolares");
    }
}
