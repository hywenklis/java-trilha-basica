import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("Alura Online");
        palavras.add("Editora casa do código");
        palavras.add("Caelum");

        //Collections.sort(palavras, comparator);

        palavras.sort((s1, s2)-> {
                if(s1.length() < s2.length())
                    return -1;
                if(s1.length() > s2.length())
                    return 1;
                return 0;
            }
        );

        palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));

        System.out.println(palavras);

        //for (String p : palavras) {
        //    System.out.println(p);
        //}

        palavras.forEach(s -> System.out.println(s));
        palavras.forEach(System.out::println);
    }
}
