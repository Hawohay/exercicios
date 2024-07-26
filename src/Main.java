


public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setSaldo(1000);
        System.out.println();
        conta1.consultarSaldo();
        System.out.println();
        conta1.depositar(100);
        conta1.consultarSaldo();
        conta1.sacar(20);
        conta1.consultarSaldo();
        //System.out.println(conta1.getSaldo());
        conta1.cobrarTarifaMensal(conta1.getSaldo(), 27);
    }
}