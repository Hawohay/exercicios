package generico;

import java.time.LocalDate;

public class Carro {

    String marca;
    String modelo;
    String versao;
    int anoDeLancamento;
    String cor;
    double valorBase;

    public void calcularDesvalorizacao(){

        int idade = calcularIdade();
        double valorAtual = valorBase;

        if (idade > 1 && idade <= 2) {
            valorAtual = valorBase - (valorBase * 0.10);
        } else if (idade > 2 && idade <= 5) {
            valorAtual = valorBase - (valorBase * 0.20);
        } else if (idade > 5 && idade <= 7) {
            valorAtual = valorBase - (valorBase * 0.27);
        } else if (idade > 7 && idade <= 12) {
            valorAtual = valorBase - (valorBase * 0.25);
        } else if (idade > 12 && idade <= 18) {
            valorAtual = valorBase - (valorBase * 0.35);
        } else if (idade > 18 && idade <= 25) {
            valorAtual = valorBase - (valorBase * 0.45);
        } else if (idade >= 26) {
            valorAtual = valorBase - (valorBase * 0.65);
        }

        switch (versao.toLowerCase()) {
            case "entrada":
                valorAtual -= valorBase * 0.065;
                break;
            case "medio":
                valorAtual -= valorBase * 0.045;
                break;
            case "completo":
                valorAtual -= valorBase * 0.025;
                break;
        }

        // Exibir ou retornar o valor calculado
        System.out.println("Valor Atual: " + valorAtual);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoDeLancamento);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + calcularIdade() + " anos");
    }

    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();

    public int calcularIdade() {
        return anoAtual - anoDeLancamento;
    }
}
