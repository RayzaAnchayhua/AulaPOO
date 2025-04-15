package lista.exerciciosaula;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    //Construtor
    public Produto() {
    }

    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Metodos
    public void exibirDetalhes(){
     System.out.println("Nome do Produto:" + this.nome +
                        "Preço do Produto:" +this.preco +
                        "Descrição do Produto:" + this.descricao );

    }
}
