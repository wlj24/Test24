package letcode;

import a.H;

import java.util.HashMap;
import java.util.Map;

public class SolutionTest {
    public static int js(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        int left = 0;
        Map<Character, Integer> param = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (param.containsKey(s.charAt(i))) {
                left = Math.max(left, param.get(s.charAt(i)) + 1);
            }
            param.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(js("abcad"));
    }
}
