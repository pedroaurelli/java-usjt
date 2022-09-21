// Sobrecarga de métodos
// Todos com os métodos com nome soma

//Critérios para diferenciar métodos
// 1 - numeros parametros
// 2 - tipos
// 3 -

public class Calculadora {

  public int soma (int a, int b) {
    System.out.println(a + b);
    return a + b;
  }

  // public float soma (float a, float b) {
  //   System.out.println(a + b);
  //   return a + b;
  // }

  public int soma (String n1, String n2) {
    int parseN1 = Integer.parseInt(n1);
    int parseN2 = Integer.parseInt(n2);
    System.out.println(parseN1 + parseN2);

    return parseN1 + parseN2;
  }

  public int soma (String n1, int b) {
    int parseN1 = Integer.parseInt(n1);
    System.out.println(parseN1 + b);

    return parseN1 + b;
  }

  public float soma (float a, float b) {
    System.out.println(a + b);
    return a + b;
  }
}
