package lista.exercicio2;

public class ContaBancaria2_2 {
    int numeroDaConta;
    String nomeDoTitular;
    double saldo;

    public ContaBancaria2_2() {
    }

    public ContaBancaria2_2(int numeroDaConta, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public double depositarSalto(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public double sacarSaldo(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public String verificarSaldo() {
        System.out.println("Saldo: R$" + this.saldo);
        return "";
    }
}

