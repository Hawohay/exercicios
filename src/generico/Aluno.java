package generico;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Aluno {
    private String nome;
    private double avaliacao;
    String endereco;
    String cpf;
    String dataNascimento;
    int numAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return avaliacao;
    }

    public void setNota(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void avaliarAluno(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

    public void exibeDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Endereço do aluno: " + endereco);
        System.out.println("Número do cpf do aluno: " + cpf);
        System.out.println("Data de nascimento do aluno: " + formataData(dataNascimento));
        System.out.println("Idade do aluno: " + calculaIdade() + " anos");
    }

    public void exibeMedia(){
        System.out.println("A média das notas é: " + mediaAvaliacoes());
    }

    public String formataData(String dataNascimento) {
        try {
            // Define o formato original da data
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // ajuste conforme o formato da sua string de entrada
            // Converte a string para LocalDate
            LocalDate date = LocalDate.parse(dataNascimento, inputFormatter);
            // Define o formato desejado da data
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            // Formata a data
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            return "Data de nascimento inválida: " + dataNascimento;
        }
    }

    public int calculaIdade() {
        try {
            // Define o formato original da data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // ajuste conforme o formato da sua string de entrada
            // Converte a string para LocalDate
            LocalDate birthDate = LocalDate.parse(dataNascimento, formatter);
            // Obtém a data atual
            LocalDate currentDate = LocalDate.now();
            // Calcula o período entre a data de nascimento e a data atual
            return Period.between(birthDate, currentDate).getYears();
        } catch (DateTimeParseException e) {
            System.out.println("Data de nascimento inválida: " + dataNascimento);
            return -1; // Retorna um valor inválido em caso de erro
        }
    }
}
