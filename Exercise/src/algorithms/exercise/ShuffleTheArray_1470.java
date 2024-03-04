package algorithms.exercise;

public class ShuffleTheArray_1470 {

    public static void main(String[] args) {

        int[] result = shuffle(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5);
        for (int i : result) {
            System.out.print(" " + i);
        }

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[2 * n];
        for (int i = 0; i < n; i++) {
            newArray[2 * i] = nums[i];
            newArray[2 * i + 1] = nums[i + n];
        }
        return newArray;
    }
}