public class App {
  public static void main (String [] args) {
    Calculadora calc = new Calculadora();
    calc.soma(8, 7);
    calc.soma(8.5f, 7.3f);
    calc.soma("50", "35");
  }
}
