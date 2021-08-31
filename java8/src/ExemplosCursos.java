import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

class Cursos{
    private String nome;
    private int alunos;

    public Cursos(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}


public class ExemplosCursos {
    public static void main(String[] args) {

        List<Cursos> cursos = new ArrayList<>();
        cursos.add(new Cursos("Python", 45));
        cursos.add(new Cursos("JavaScript", 150));
        cursos.add(new Cursos("Java 8", 113));
        cursos.add(new Cursos("C", 55));

        cursos.sort(comparing(Cursos::getAlunos));
//        cursos.forEach(c -> System.out.println(c.getNome()));
        int sum = cursos.stream().mapToInt(Cursos::getAlunos).filter(alunos -> alunos >= 100).sum();
        System.out.println(sum);
    }
}
