package algorithms.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints_1637 {

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        int maxWidth = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] point1 = points[i];
            int[] point2 = points[i + 1];
            maxWidth = Math.max(maxWidth, point2[0] - point1[0]);
        }
        return maxWidth;
    }

    public int maxWidthOfVerticalArea2(int[][] points) {
        int size = points.length;
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = points[i][0];
        }

        Arrays.sort(nums);

        int maxWidth = 0;

        for (int i = 1; i < size; i++) {
            int width = nums[i] - nums[i - 1];
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return maxWidth;
    }
}