import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> idades = new  ArrayList<>();

        idades.add(22);
        idades.add(13);
        idades.add(25);
        idades.add(20);
        idades.add(18);
        idades.add(19);
        int idade=2;

        System.out.println(idades);

        System.out.println(idades.size());

        System.out.println(idades.contains(20));
        System.out.println(idades.get(idades.size()/2));

        Collections.sort(idades);
    }
}
