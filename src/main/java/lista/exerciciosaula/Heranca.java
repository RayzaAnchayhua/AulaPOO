package lista.exerciciosaula;

import java.util.ArrayList;

public class Heranca {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();
        Vendedor vendedor1 = new Vendedor("123","Leonardo","Davince@Leonardo.com", lista);

        Eletronicos elet = new Eletronicos("Samsung","S21","Smartphone", 1999, "8GB Ram - 256 ROM",vendedor1);
        //Vestuario vest = new Vestuario("Blusa Olivia Rodrigo", 60, "Blusa OR", vendedor1);
        Livros liv = new Livros("Carlos Drumont",100,"A viação é linda", vendedor1);

        vendedor1.inserir(elet);
        vendedor1.inserir(liv);


        vendedor1.listar();

        vendedor1.removerlista();

        vendedor1.removerItemlista("Smartphone");
        System.out.printf(" --- \n");
        vendedor1.listar();
        /*
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

         */
    }
}
