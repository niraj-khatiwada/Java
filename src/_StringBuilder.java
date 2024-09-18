public class _StringBuilder {
    public static void main(String[] args) {
        var str = new StringBuilder();

        // Add
        str.append("hello");
        str.append("world");

        // Delete by index
        str.deleteCharAt(0);
        str.deleteCharAt(1);

        // Find char at index
        str.charAt(0);
        str.charAt(1);

        // convert to string
        str.toString();

        // Substring
        str.substring(0, 2);

    }
}
