package CodingBat.Warmup2;

public class StringMatch {
    public static int stringMatch(String a, String b) {
        int count = 0;
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length - 1; i++) {
            String substring1 = a.substring(i, i + 2);
            String substring2 = b.substring(i, i + 2);
            if (substring1.equals(substring2)) {
                count++;
            }
        }
        return count;

    }
}
