package conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println(conjunto);


        Set<String> conjuntoDoJava = new HashSet<>();

        conjuntoDoJava.add("Paulo");
        conjuntoDoJava.add("Mauricio");

        System.out.println(conjuntoDoJava);

        String x = "Guilherme";
        x.hashCode();

        System.out.println("Guilherme".hashCode());
        System.out.println("Guilherme".hashCode());
    }
}
