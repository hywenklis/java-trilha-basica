package exercicio2;

import java.time.LocalDate;

public class Pessoa {

    private final String nome;
    private final int anonasc;
    private final float altura;

    public Pessoa(final String nome, final int anonasc, final float altura) {
        this.nome = nome;
        this.anonasc = anonasc;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return LocalDate.now().getYear() - this.anonasc;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.getIdade() + " anos " + "Altura: " + this.altura;
    }
}
