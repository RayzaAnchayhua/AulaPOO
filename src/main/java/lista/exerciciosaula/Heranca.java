package lista.exerciciosaula;

public class Heranca {
    public static void main(String[] args) {
Eletronicos elet = new Eletronicos("Notebook",3.500,"Notebook Asus");
Vestuario vest = new Vestario("Blusa Olivia Rodrigo", 60, "Blusa OR");
Livros liv = new Livros("Sol da Meia Noite", 60, "Livro");

        elet.setMarca("Samsung");
        elet.setModelo("S20+");
        elet.setNome("Smartphone");
        elet.setPreco(3.000);
        elet.setDescricao("Um aparelho de ultima geração");



    }
}
