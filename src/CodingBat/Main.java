package CodingBat;

import CodingBat.Warmup2.Array123;
import CodingBat.Warmup2.ArrayCount9;
import CodingBat.Warmup2.StringMatch;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringMatch.stringMatch("xxcaazz", "xxbaaz"));
        int[] test = {1, 1, 2, 1, 2, 3};
        System.out.println(Array123.array123(test));
        int[] test1 = {1, 9, 9, 3, 9, 2, 3};
        System.out.println(ArrayCount9.arrayCount9(test1));

    }
}
