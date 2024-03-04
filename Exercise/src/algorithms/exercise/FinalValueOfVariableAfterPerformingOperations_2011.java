package algorithms.exercise;

public class FinalValueOfVariableAfterPerformingOperations_2011 {

    public static void main(String[] args) {
        int result = finalValueAfterOperations2(new String[]{"--X","X++","X++"});
        System.out.println(result);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int value = 0;

        for (String operation : operations) {
            if (operation.contains("--")) {
                value--;
            }
            else {
                value++;
            }
        }

        return value;
    }

    public static int finalValueAfterOperations2(String[] operations) {
        int value = 0;

        for (String op : operations) {
            if (op.charAt(1) == '-') {
                value--;
            }
            else {
                value++;
            }
        }

        return value;
    }
}