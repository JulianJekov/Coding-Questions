public class _10_LongestOrderedSubstring {
    public static void main(String[] args) {
        String s = "abcdeaaacabcabcd";
        System.out.println(longestOrderedSubstring(s));
    }

    public static String longestOrderedSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }
        int start = 0;
        int maxStart = 0;
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = start;
                }
                start = i;
                currentLength = 1;
            }
        }

        if (maxLength < currentLength) {
            maxLength = currentLength;
            maxStart = start;
        }
        return s.substring(maxStart, maxStart + maxLength);
    }
}