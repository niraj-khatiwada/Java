import java.lang.String;

public class String_ {
    public static void main(String[] args) {
        String name = "Niraj";

        System.err.println(name.length());
        System.err.println(name.trim());
        System.err.println(name.substring(1, 2));
        System.err.println(name.contains("N"));
        System.err.println(name.replace("N", "n"));
        System.err.println(name.toLowerCase());
        System.err.println(name.toUpperCase());
        System.err.println(name.indexOf("i"));
        System.err.println(name.startsWith("N"));
        System.err.println(name.startsWith("k"));
        char[] charactersArray = name.toCharArray();
        System.err.println(charactersArray.length);

        name = String.format("Hello %s\n", name);

        System.out.printf(name);

    }
}
