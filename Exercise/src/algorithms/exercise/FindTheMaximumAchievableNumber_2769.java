package algorithms.exercise;

public class FindTheMaximumAchievableNumber_2769 {

    public static void main(String[] args) {
        int result = theMaximumAchievableX(4, 1);
        System.out.println(result);
    }

    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }
}