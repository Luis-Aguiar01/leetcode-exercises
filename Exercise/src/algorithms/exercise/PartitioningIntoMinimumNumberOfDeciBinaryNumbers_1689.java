package algorithms.exercise;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers_1689 {

    public static void main(String[] args) {
        int result = minPartitions2("27346209830709182346");
        System.out.println(result);
    }

    public static int minPartitions(String n) {
        int max = 0;
        int size = n.length();

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(Character.toString(n.charAt(i)));
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int minPartitions2(String n) {
        int max = 0;
        char[] arr = n.toCharArray();

        for (char c : arr) {
            if (max < (c - '0')) {
                max = c - '0';
            }
        }

        return max;
    }

    public static int minPartitions3(String n) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) - '0' == 9) {
                return 9;
            }
            max = Math.max(max, n.charAt(i) - '0');
        }

        return max;
    }

}
