package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> paraules = Arrays.asList("hola", "Clara", "explicació", "bombo", "programació", "port", "exercici");


        paraules.stream()
                .filter(c -> ((c.contains("o") || c.contains("O")) && (c.length() > 5)))
                .forEach(l -> System.out.print(l + "\n"));

    }
}

