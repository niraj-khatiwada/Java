
import java.util.*;

class Main {

    public static void main(String[] args) {
        var queue = new ArrayDeque<Integer>();
        queue.add(1);
        queue.add(3);
        queue.add(2);

        for (var item : queue) {
            System.out.println(item); // We cannot get values via index for queue. Works for stack though.
        }


        var s = new StringBuilder();
        s.delete(0, s.length())


    }

}
