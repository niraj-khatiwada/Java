import java.util.*;

class Main {

    public static void main(String[] args) {
        var array = new String[3];
        array[1] = "Suraj";
        array[0] = "Niraj";
        array[2] = "airaj";

        Arrays.sort(array, (a, b) -> (a.toUpperCase()).compareTo(b.toUpperCase()));

        System.out.println(Arrays.toString(array));
    }

}
