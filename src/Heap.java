import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heap {
    private class Node {
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void main() {
        // var minHeap = new PriorityQueue<Integer>();
        // minHeap.offer(1);
        // minHeap.offer(2);
        // minHeap.offer(3);
        // System.out.println(minHeap);

        // var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        // maxHeap.offer(1);
        // maxHeap.offer(2);
        // maxHeap.offer(3);
        // System.out.println(maxHeap);

        var nodeMaxHeap = new PriorityQueue<Node>(Comparator.comparingInt(x -> -(x.value)));
        nodeMaxHeap.offer(new Node(1));
        nodeMaxHeap.offer(new Node(2));
        nodeMaxHeap.offer(new Node(3));

        while (!nodeMaxHeap.isEmpty()) {
            System.out.println(nodeMaxHeap.poll().value);
        }
    }
}
