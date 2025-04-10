package lista.exercicio1;

import java.util.Scanner;

public class Exercicio1_1 {

    int numero1;
    int numero2;

    Scanner scanner = new Scanner(System.in);
    @Override
    public String toString (){
        System.out.println(("O programa compara dois numero!"));
        System.out.print("Insira um numero: ");
        numero1 = scanner.nextInt();

        System.out.print("Insira um numero: ");
        numero2 = scanner.nextInt();

        if (numero1 >numero2){
            System.out.println ("O numero " + numero1 + "é maior do que o numero " + numero2+ " !");
        }
        else if(numero1==numero2){
            System.out.println("Os numero são iguais!");
        }
        else{
            System.out.println("O numero " + numero2 + " é maior do que o numero " + numero1 + " !");
        }
        return "";
    }

}
