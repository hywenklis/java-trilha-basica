package exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private final String nome;
    private final String dataNascimento;
    private final double altura;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void dadosPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        calculaIdade();
    }

    public void calculaIdade() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aniversario = LocalDate.parse(getDataNascimento(), formatter);
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(aniversario, dataAtual);

        System.out.println("Idade: " + periodo.getYears() + " Anos");
    }

}
