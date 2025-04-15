package lista.exerciciosaula;

public class Livros extends Produto{
    private String autor;
    private int numPaginas;

    //Construtores
    public Livros() {
    }

    public Livros(int numPaginas, String autor) {
        super();
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

    }
}
