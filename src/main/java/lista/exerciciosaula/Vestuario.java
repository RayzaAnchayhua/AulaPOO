package lista.exerciciosaula;

public class Vestuario extends Produto {
    private String marca;
    private String tamanho;
    private String cor;

    //Constutores
    public Vestuario(String nome, double preco, String descricao) {
     super(nome,preco,descricao);
    }

    public Vestuario(String marca, String tamanho, String cor) {
        super();
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Metodos
    @Override
    public void exibirDetalhes(){

    }
}
