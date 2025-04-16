package lista.exerciciosaula;

public class Vestuario extends Produto {
    private String marca;
    private double tamanho;
    private String cor;

    //Constutores
    public Vestuario(String nome, double preco, String descricao, Vendedor vendedor) {
     super(nome,preco,descricao, vendedor);
    }

    public Vestuario(String marca, double tamanho, String cor, String nome, double preco, String descricao, Vendedor vendedor) {
        super(nome,preco,descricao, vendedor);
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //Getters e Setters
    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public double getTamanho() {return tamanho;}

    public void setTamanho(double tamanho) {this.tamanho = tamanho;}

    public String getCor() {return cor;}

    public void setCor(String cor) {this.cor = cor;}

    //Metodos
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes(); //Sobre escrita + Herança
        System.out.println("----------------------------------" +
                           "\n•Marca: " + this.marca +
                           "\n•Tamanho: " +this.tamanho +
                           "\n•Cor: " + this.cor);
    }
}
