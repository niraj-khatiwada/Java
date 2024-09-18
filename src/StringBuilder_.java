import java.util.Arrays;

public class StringBuilder_ {
    public static void main(String[] args) {
        var strBuilder = new StringBuilder();
        // Add
        strBuilder.append("hello");
        strBuilder.append("world");

        // Delete by index
        strBuilder.deleteCharAt(0);
        strBuilder.deleteCharAt(1);

        // Find char at index
        strBuilder.charAt(0);
        strBuilder.charAt(1);

        // convert to string
        strBuilder.toString();

        // Substring
        strBuilder.substring(0, 2);

    }
}
