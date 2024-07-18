import java.util.function.Function;

public class HigherOrderFunction {
    public static void main(String[] args) {
        System.out.println(HigherOrderFunction.sumWithCallback(1, 2, a -> a * 2));
        System.out.println(HigherOrderFunction.sumWithCallback(1, 2, a -> a + 2));
        System.out.println(HigherOrderFunction.sumWithCallback(1, 2, a -> a ^ 2));

    }

    public static int sumWithCallback(int a, int b, Function<Integer, Integer> cb) {
        return (a + b) + cb.apply(a);
    }
}
