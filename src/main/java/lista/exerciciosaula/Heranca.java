package lista.exerciciosaula;

import java.util.ArrayList;

public class Heranca {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        Vendedor vendedor3 = new Vendedor();


        Eletronicos elet = new Eletronicos("Notebook",3.500,"Notebook Asus",vendedor1);
        Vestuario vest = new Vestuario("Blusa Olivia Rodrigo", 60, "Blusa OR", vendedor2);
        Livros liv = new Livros("Sol da Meia Noite", 60, "Livro", vendedor3);

            ArrayList<Produto> listaProdutos = new ArrayList();

            listaProdutos.add(elet);
            listaProdutos.add(vest);
            listaProdutos.add(liv);

            System.out.println("N. Itens: " + listaProdutos.size());

            for(int i = 0; i < listaProdutos.size(); i++){
                System.out.println("Produto: " + i + " -> " +
                        listaProdutos.get(i).getNome());
            }

            vendedor1.setNome("Vendedor1");
            vendedor1.setId("123456");
            vendedor1.setEmail("vendedor1@gmail.com");

            vendedor2.setNome("Vendedor2");
            vendedor2.setId("987654");
            vendedor2.setEmail("vendedor2@gmail.com");

            vendedor3.setNome("Vendedor3");
            vendedor3.setId("987654");
            vendedor3.setEmail("vendedor3@gmail.com");

            elet.setMarca("Asus");
            elet.setModelo("Gamer PRO");

            vest.setMarca("OR");
            vest.setTamanho(16);
            vest.setCor("Preto");

            liv.setAutor("Stephenie Meyer");
            liv.setNumPaginas(1890);

            elet.exibirDetalhes();
            vest.exibirDetalhes();
            liv.exibirDetalhes();
    }
}
