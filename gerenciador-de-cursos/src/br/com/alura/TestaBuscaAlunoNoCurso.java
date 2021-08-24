package br.com.alura;

public class TestaBuscaAlunoNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 25));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 641243);
        Aluno a3 = new Aluno("Mauricio Aniche", 425577);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 641243? ");
        Aluno aluno = javaColecoes.buscaMatriculado(64124);
        System.out.println("Aluno: " + aluno);
    }
}
