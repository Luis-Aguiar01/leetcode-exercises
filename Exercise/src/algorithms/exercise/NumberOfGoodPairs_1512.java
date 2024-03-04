package algorithms.exercise;

public class NumberOfGoodPairs_1512 {

    public static void main(String[] args) {
        int result = numIdenticalPairs2(new int[]{ 1, 1, 1, 1 });
        System.out.println(result);
    }

    public static int numIdenticalPairs(int[] nums) {

        int countGoodPairs = 0;
        int size = nums.length;

        for (int i = 0; i != size - 1;) {
            for (int j = i + 1; j <= size - 1; j++) {
                if (nums[i] == nums[j]) {
                    countGoodPairs++;
                }
                if (j == size - 1) {
                    i++;
                }
            }
        }
        return countGoodPairs;
    }

    public static int numIdenticalPairs2(int[] nums) {
        int ans = 0;
        int[] array = new int[101];

        for (int value : nums) {
            ans += array[value]++;
        }

        return ans;
    }
}