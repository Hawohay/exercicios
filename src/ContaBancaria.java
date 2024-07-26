


public class ContaBancaria {

    private int numeroDaConta;
    private double saldo = 0;
    public String titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito no valor de R$" + valor + " Realizado com sucesso!");

        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor){
        if (saldo > 0 && valor > 0){
            saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + " Realizado com sucesso!");

        } else {
            System.out.println("Saldo insuficiente! Quebrado!");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo da conta: R$" + saldo);
    }
}
