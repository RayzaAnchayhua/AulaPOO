package lista.exercicio2;

public class TesteContaBancaria2_2 {

    public static void main(String[] args) {
        ContaBancaria2_2 conta = new ContaBancaria2_2();
        conta.depositarSalto((double)100.0F);
        conta.sacarSaldo((double)50.0F);
        conta.verificarSaldo();
    }
}