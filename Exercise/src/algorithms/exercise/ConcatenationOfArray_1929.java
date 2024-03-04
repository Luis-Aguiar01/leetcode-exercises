package algorithms.exercise;

public class ConcatenationOfArray_1929 {

    public static void main(String[] args) {
        getConcatenation(new int[]{1, 2, 3, 4, 1});
    }

    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size * 2];

        for (int i = 0; i < size * 2; i++) {
            ans[i] = nums[i % size];
        }

        return ans;
    }
}