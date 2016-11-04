package effective.tricks;

import java.util.*;

public class Autoboxing {
    public static void main(String[] args) {
        String[] strings = {"0", "1", "2", "3", "4", "5"};
        List<Integer> integers = new ArrayList<>();
        for (String s : strings) {
            integers.add(Integer.valueOf(s));
        }
        System.out.println(Collections.binarySearch(integers, 1, cmp));
    }

    private static Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer iBoxed, Integer jBoxed) {
//            return i < j ? -1 : (Objects.equals(i, j) ? 0: 1);
            int i = iBoxed;
            int j = jBoxed;
            return i < j ? -1 : (i == j ? 0 : 1);
        }
    };
}
