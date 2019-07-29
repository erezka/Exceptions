package CodingBat.Warmup2;

public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int countNines = 0;
        for (int num : nums) {
            if (num == 9) {
                countNines++;
            }
        }
        return countNines;
    }
}
