package generico;


public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(double saldo, double valor){
        double saldoComDesconto = saldo - valor;
        System.out.println("Toma! uma tarifinha mensal pra você ficar esperto!");
        System.out.println("Saldo da conta: R$" + saldoComDesconto);
    }
}
