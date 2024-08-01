package generico.main;

import generico.ContaBancaria;
import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        ContaBancaria contaBancariaI = new ContaBancaria(12345678,100,"Hawohay");
        ContaBancaria contaBancariaII = new ContaBancaria(10000008,200,"Lúcia");
        ContaBancaria contaBancariaIII = new ContaBancaria(10000009,1000,"Mariana");

        contas.add(contaBancariaI);
        contas.add(contaBancariaII);
        contas.add(contaBancariaIII);

        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }

        ContaBancaria contaMaiorSaldo = null;

        for (ContaBancaria conta : contas) {
            if (contaMaiorSaldo == null || conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        if (contaMaiorSaldo != null) {
            System.out.println("Conta com o maior saldo: " + contaMaiorSaldo);
        }

    }
}
