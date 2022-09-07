import javax.swing.JOptionPane;

public class TestLivroDeNotas {
  public static void main(String[] args) {
    String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina");

    // Declaro o nome da variavel com o tipo da minha classe
    LivroDeNotas livro = new LivroDeNotas();

    livro.exibirMensagem();

    livro.exibirDisciplina(nomeDisciplina);
  }
}
