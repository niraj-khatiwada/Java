
import java.util.*;

class Main {
    public static class Node {
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Main.works();

    }

    public void works() {
        var set = new HashSet<Node>();
        var node1 = new Node(1);
        var node2 = new Node(2);
        set.add(node1);
        set.add(node2);
    }

}
