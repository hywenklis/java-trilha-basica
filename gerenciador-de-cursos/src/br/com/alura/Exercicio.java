package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();
        cursos.add("Java");
        cursos.add("Python");
        cursos.add("Data Science");

        Collections.sort(cursos);

        cursos.forEach(System.out::println);

        cursos.remove(1);

        System.out.println("-------------------");
        System.out.println("Depois de remover:");
        for (String curso : cursos) {
            System.out.println(curso);
        }

        System.out.println("------------------");
        System.out.println("Primeiro curso da lista: " + cursos.get(0));
    }
}
