package P38.CountandSay;

public class CountandSay {
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String number = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < number.length()) {
            int j = 1;
            while (i < number.length()-1 && number.charAt(i) == number.charAt(i+1)) {
                j++;
                i++;
            }
            sb.append(String.valueOf(j));
            sb.append(number.charAt(i++));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(countAndSay(i));
        }
    }
}
