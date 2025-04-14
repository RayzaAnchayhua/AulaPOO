package lista.exercicio2;

public class TestePonto4_2 {

    public static void main(String[] args) {
        Ponto4_2 a = new Ponto4_2("A",25,3);
        Ponto4_2 b = new Ponto4_2("B",4,15);

        System.out.println("---------------------");
        System.out.println("Calculo da Distancia entre dois pontos: "+a.calculoDistancia(a,b));
        System.out.println("Calculo do Coeficiente Angular da Reta: "+a.calculoCoeficiente(a,b));
        System.out.print(a.toString());

    }
}
