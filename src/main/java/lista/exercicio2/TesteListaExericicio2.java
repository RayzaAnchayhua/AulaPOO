package lista.exercicio2;

public class TesteListaExericicio2 {
    public static void main(String[] args) {
        //Exercicio1
        System.out.println("---------------------");
        System.out.println("Exercicio 1:");
        Exercicio1_2 e = new Exercicio1_2("Metamorfose", 55.92, 14);
        e.adicionar(9);
        e.remover(5);
        e.mostrarDetalhes();

        //Exercicio2
        System.out.println("---------------------");
        System.out.println("Exercicio 2:");
        ContaBancaria2_2 conta = new ContaBancaria2_2();
        conta.depositarSalto((double)100.0);
        conta.sacarSaldo((double)25.0);
        conta.depositarSalto((double)50.0);
        conta.verificarSaldo();

        //Exercicio3
        System.out.println("---------------------");
        System.out.println("Exercicio 3:");
        Curso3_2 curso = new Curso3_2("Ciência da Computação","UFBRA");
        Aluno3_2 aluno = new Aluno3_2("Rayza Luana","RA12345",curso);
        aluno.toString();

        //Exercicio4
        System.out.println("---------------------");
        System.out.println("Exercicio 4:");
        Ponto4_2 a = new Ponto4_2("A",2,5);
        Ponto4_2 b = new Ponto4_2("B",0,1);
        System.out.println("Calculo da Distancia entre dois pontos: "+a.calculoDistancia(a,b));
        System.out.println("Calculo do Coeficiente Angular da Reta: "+a.calculoCoeficiente(a,b));
        a.toString();
    }
}
