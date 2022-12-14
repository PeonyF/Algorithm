package leetcode;

public class Q136 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            System.out.println(Integer.toBinaryString(result));
            System.out.println(Integer.toBinaryString(num));
            result ^= num;

        }

        return result;
    }
}