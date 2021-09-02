import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TestaCurso {

    public static void main(String[] args) {
        List<Cursos> cursos = new ArrayList<>();
        cursos.add(new Cursos("Python", 45));
        cursos.add(new Cursos("JavaScript", 150));
        cursos.add(new Cursos("Java 8", 113));
        cursos.add(new Cursos("C", 55));

        cursos.sort(comparing(Cursos::getAlunos));

        cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

        cursos.stream().map(Cursos::getAlunos).filter(alunos -> alunos > 50).forEach(System.out::println);
        cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Cursos::getAlunos).average();
        cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(curso -> System.out.println(curso.getNome()));

        cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

        cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.parallelStream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toMap(Cursos::getNome, Cursos::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}
