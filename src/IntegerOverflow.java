public class IntegerOverflow {
    private static final int MOD = (int) 1e9 + 7;;

    public static void main(String[] args) {
        int[] values = { 1000000000, 1000000000, 1000000000 };
        int sumWithModule = 0;
        int sum = 0;

        for (int value : values) {
            sumWithModule = (sumWithModule + value) % MOD;
            sum = sum + value;
        }

        System.out.println("Sum with modulo is: " + sumWithModule); // Within Bound
        System.out.println("Sum that overflew: " + sum); // Will overflow

    }
}
