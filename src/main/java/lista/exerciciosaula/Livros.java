package lista.exerciciosaula;

public class Livros extends Produto{
    private String autor;
    private int numPaginas;

    //Construtores
    public Livros(String nome, double preco, String descricao) {
    super(nome, preco, descricao);
    }

    public Livros(int numPaginas, String autor) {
        super(nome, preco, descricao);
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
        System.out.println("Autor:" + this.autor +
                           "Quantidade de Paginas:" + this.numPaginas);
    }
}
