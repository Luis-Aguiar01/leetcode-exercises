package algorithms.exercise;

public class DefangingAnIPAddress_1108 {

    public static void main(String[] args) {
        String result = defangIPaddr2("1.1.1.1");
        System.out.println(result);
    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static String defangIPaddr2(String address) {
        int size = address.length();
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (address.charAt(i) == '.') {
                string.append("[.]");
            }
            else {
                string.append(address.charAt(i));
            }
        }

        return string.toString();
    }
}