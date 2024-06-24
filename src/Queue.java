import java.util.ArrayDeque;

class Queue {
    public static void main(String[] args) {
        // ArrayDeque = Array Double Ended Queue. We can add items from front or back.
        var queue = new ArrayDeque<Integer>();

        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);

    }
}
