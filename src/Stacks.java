import java.util.Stack;

public class Stacks {
    public static void main() {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(1);
        stacks.push(2);
        System.out.println(stacks);
        System.out.println(stacks.peek());
        System.out.println(stacks.isEmpty());
        stacks.pop();
        System.out.println(stacks.size());

        String name = "Niraj";
        var reversed = new StringBuffer();
        var stack = new Stack<Character>();
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println(reversed);

        // Getting the values of stack in same order as stack
        var order = new Stack<Integer>();
        order.add(1);
        order.add(3);
        order.add(2);

        // We need to loop in reverse to get the exact order
        for (var i = order.size() - 1; i >= 0; i--) {
            System.out.println(order.get(i)); // We can get values via index for stack. Does not work for queue though.
        }
    }

}
