import java.time.LocalDate;

public class Carro {

    String modelo;
    int ano;
    String cor;

    public void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + calcularIdade() + " anos");
    }
    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();

    public int calcularIdade() {
        return anoAtual - ano;
    }

}
