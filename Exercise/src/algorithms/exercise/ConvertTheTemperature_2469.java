package algorithms.exercise;

import java.util.Arrays;
import java.util.List;

public class ConvertTheTemperature_2469 {

    public static void main(String[] args) {
        double[] result = convertTemperature(36.5);
    }

    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];

        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;

        return ans;
    }

    public static double[] convertTemperature2(double celsius) {
        return new double[]{ celsius + 273.15, celsius * 1.80 + 32.00 };
    }
}