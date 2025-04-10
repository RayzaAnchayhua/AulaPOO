package lista.exercicio2;

public class Exercicio1_2 {
    String nome;
    double preco;
    int qtdeEstoque;

    public Exercicio1_2(String nome, double preco, int qtdeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque;
    }

    public void adicionar(int qtde) {
        this.qtdeEstoque += qtde;
    }

    public void remover(int qtde) {
        this.qtdeEstoque -= qtde;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome do Produto: " + this.nome);
        System.out.println("Preço do Produto: " + this.preco);
        System.out.println("Quantidade Estoque: " + this.qtdeEstoque);
    }
}
