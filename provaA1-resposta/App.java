import javax.swing.JOptionPane;

public class App {
  public static void main (String [] args) {
    int M = Integer.parseInt(JOptionPane.showInputDialog("Informar numero de UCs"));
    
    double dividendo = 0;
    double divisor = 0;
    
    for (int n = 0; n < M; n++) {
      double nota = Double.parseDouble(JOptionPane.showInputDialog("Informar nota da UC"));
      double cargaHorario = Double.parseDouble(JOptionPane.showInputDialog("Informar carga horaria da UC"));
      
      dividendo = dividendo + nota * cargaHorario;
      divisor = divisor + cargaHorario;
    }
    
    double resultado = (double)dividendo / (double)(divisor * 100);
    JOptionPane.showMessageDialog(null, "Seu IRA: " + resultado);
  }
}