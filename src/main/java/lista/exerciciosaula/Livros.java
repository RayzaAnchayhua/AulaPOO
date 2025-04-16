package lista.exerciciosaula;

public class Livros extends Produto{
    private String autor;
    private int numPaginas;

    //Construtores
    public Livros(String nome, double preco, String descricao, Vendedor vendedor) {
        super(nome, preco, descricao, vendedor);
    }

    public Livros(int numPaginas, String autor, String nome, double preco, String descricao, Vendedor vendedor) {
        super(nome, preco, descricao, vendedor);
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    //Getters e Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //Metodos
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes(); //Sobre escrita + Herança
        System.out.println("----------------------------------" +
                           "\n•Autor: " + this.autor +
                           "\n•Quant. Páginas: " +this.numPaginas);
    }
}
