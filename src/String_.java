import java.lang.String;
import java.util.Arrays;

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

        // Sorting string[]
        var str = new String[] { "i", "am", "code" };
        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); // ascending
        Arrays.sort(str, (a, b) -> b.compareTo(a)); // b.compareTo(a) essentially means b-a
        System.out.println(Arrays.toString(str)); // descending

        // If the strings are numbers, you can also apply the same logic
        var strNum = new String[] { "999", "9", "1" };
        Arrays.sort(strNum);
        System.out.println(Arrays.toString(strNum)); // ascending
        Arrays.sort(strNum, (a, b) -> b.compareTo(a)); // b.compareTo(a) essentially means b-a
        System.out.println(Arrays.toString(strNum)); // descending

    }
}
