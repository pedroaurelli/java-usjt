import javax.swing.JOptionPane;

//Calcular o pagamento de comissão de vendedores de peças, levando-se em
//consideração que sua comissão será de 5% do total da venda e que você tem os seguintes
//dados: preço unitário da peça e quantidade vendida.

public class Comissao {
  public static void main (String [] args) {
    double price = Integer.parseInt(JOptionPane.showInputDialog("Insira o preco da peca"));
    double quantity = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de pecas"));

    double result = price * quantity;

    JOptionPane.showMessageDialog(null, "Sua comissao e de R$" + result * 0.05);
  }
}
