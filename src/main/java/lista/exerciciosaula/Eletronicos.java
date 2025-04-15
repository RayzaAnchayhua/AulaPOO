package lista.exerciciosaula;

public class Eletronicos extends Produto{
    private String marca;
    private String modelo;

    //Construtores
    public Eletronicos(String nome, double preco, String descricao) {
    super(nome, double, descricao);
    }

    public Eletronicos(String marca, String modelo) {
        super(nome, preco, descricao);
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Metodos
    @Override
    public void exibirDetalhes(){

    }

}
