import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("Alura Online");
        palavras.add("Editora casa do código");
        palavras.add("Caelum");

        //Collections.sort(palavras, comparator);

//        palavras.sort((s1, s2)-> {
//                if(s1.length() < s2.length())
//                    return -1;
//                if(s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        );


        palavras.sort(comparingInt(String::length));

        System.out.println(palavras);

        //for (String p : palavras) {
        //    System.out.println(p);
        //}

//        palavras.sort(Comparator.comparing(s -> s.length()));
//
//        palavras.forEach(s -> System.out.println(s));
//        palavras.forEach(System.out::println);
//
//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);

        palavras.sort(comparing(String::length));

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);

        palavras.forEach(System.out::println);
    }
}
