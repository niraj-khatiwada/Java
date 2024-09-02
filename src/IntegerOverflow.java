public class IntegerOverflow {
    private static final int MOD = (int) 1e9 + 7;;

    public static void main(String[] args) {
        // Method 1: Using long instead of int
        int[] values = { 1000000000, 1000000000, 1000000000 };
        long sumLong = 0;

        for (int value : values) {
            sumLong += value;
        }

        System.out.println("Long: Sum that won't overflow for int: " + (int) (sumLong % MOD)); // Within Bound
        System.out.println("Long: Sum that won't overflow for long: " + sumLong); // Won't overflow for long
        System.out.println("Long: Sum that overflew for int: " + (int) sumLong); // But will overflow for int

        int sumWithModule = 0;
        int sum = 0;

        for (int value : values) {
            sumWithModule = (sumWithModule + value) % MOD;
            sum = sum + value;
        }

        System.out.println("Int: Sum that won't overflow for int: " + sumWithModule); // Within Bound
        System.out.println("Int: Sum that overflew for int: " + sum); // Will overflow

    }
}
