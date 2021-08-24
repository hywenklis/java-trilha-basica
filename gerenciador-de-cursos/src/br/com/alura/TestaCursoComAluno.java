package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

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

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println(javaColecoes.estaMatriculado(a1));


        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));

        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
