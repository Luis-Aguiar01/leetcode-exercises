package algorithms.exercise;

public class FindTheOriginalArrayOfPrefixXor_2433 {
    public static int[] findArray(int[] pref) {
        int size = pref.length;
        int[] newArray = new int[size];

        newArray[0] = pref[0];

        for (int i = 1; i < size; i++) {
            newArray[i] = pref[i] ^ pref[i - 1];
        }

        return newArray;
    }
}