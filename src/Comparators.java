import java.util.*;

public class Comparators {

    private class Node {
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void sortMatrix() {
        // 2D Matrix Dependency Sort
        var a = new int[] { 0, 3, 1, 5, 8, 5 };
        var b = new int[] { 6, 4, 2, 7, 9, 9 };
        // When b is sorted, it's matching index needs to be sorted in a as well.

        var matrix = new int[a.length][3];
        for (var i = 0; i < matrix.length; i++) {
            matrix[i][0] = i; // index
            matrix[i][1] = a[i]; // a
            matrix[i][2] = b[i]; // b
        }

        System.out.println("Before");
        print(matrix);
        Arrays.sort(matrix, Comparator.comparingInt(x -> x[2])); // Sorted for b
        System.out.println("After");
        print(matrix);
    }

    public void sortObjects() {
        // Sorting an object
        var nodes = new Node[3];
        nodes[0] = new Node(2);
        nodes[1] = new Node(3);
        nodes[2] = new Node(1);

        Arrays.sort(nodes, Comparator.comparing(x -> x != null ? x.value : Double.MAX_VALUE));

        for (var node : nodes) {
            System.out.printf(" %s ", node.value);
        }
        System.out.println();
    }

    public void doubleSorting() {
        // Sort by 1st value first and then sort by difference
        // This is not same as sort by 1st value first and then again apply another sort
        // based on difference to the previous sort (See example below)
        // This will do batch sorting
        int[][] nums = new int[][] { { 1, 4 }, { 4, 4 }, { 2, 2 }, { 3, 4 }, { 1, 1 } };
        Comparator<int[]> c1 = Comparator.comparingInt(x -> x[0]);
        Comparator<int[]> c2 = Comparator.comparingInt(x -> x[1] - x[0]);
        Arrays.sort(nums, c1.thenComparing(c2));
        print(nums);

        // THIS IS NOT SAME AS ABOVE
        // Arrays.sort(nums, Comparator.comparingInt(x -> x[0]));
        // ⬆️ This will sort by 1st value
        // Arrays.sort(nums, Comparator.comparingInt(x -> x[1]-x[1]));
        // ⬆️ And again will sort and rearranges by difference

    }

    private void print(int[][] grid) {
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[0].length; j++) {
                System.out.printf("%5s", grid[i][j]);
            }
            System.out.println();
        }
    }
}
