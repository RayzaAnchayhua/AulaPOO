package lista.exerciciosaula;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private Vendedor idVendedor;

    /*Construtor
    public Produto() {
    }*/

    public Produto(String nome, double preco, String descricao, Vendedor vendedor) {
        this.idVendedor = vendedor;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    //Getters e Setters
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}

    public void setPreco(double preco) {this.preco = preco;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public Vendedor getIdVendedor() {return idVendedor;}

    public void setIdVendedor(Vendedor vendedor) {this.idVendedor = vendedor;}

    //Metodos
    public void exibirDetalhes(){
     System.out.println("---------------------------------" +
                        "\nID: "+this.idVendedor.getId()+
                        "\n•Nome do Produto: " + this.nome +
                        "\n•Preço do Produto:" +this.preco +
                        "\n•Descrição do Produto: " + this.descricao);

    }
}
