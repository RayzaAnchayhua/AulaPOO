package lista.exercicio2;

public class TesteContaBancaria2_2 {

    public static void main(String[] args) {
        ContaBancaria2_2 conta = new ContaBancaria2_2();
        conta.depositarSalto((double)50.0);
        conta.sacarSaldo((double)25.0);
        conta.verificarSaldo();
    }
}