package n1exercici8;


public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface =
                (s) -> new StringBuilder(s).reverse().toString();

        String sentence = "Hola, què tal?";
        String reversed = functionalInterface.reverse(sentence); //girar frase

        System.out.println(reversed);
    }
}

