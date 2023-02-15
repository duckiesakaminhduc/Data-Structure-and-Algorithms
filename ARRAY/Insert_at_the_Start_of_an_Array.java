import java.util.Arrays;

public class Insert_at_the_Start_of_an_Array {
    int[] sortStart(int[] nums, int x) {
        int[] result = Arrays.copyOf(nums, nums.length + 1);
        for (int i = nums.length; i > 0; i--) {
            result[i + 1] = nums[i];
        }
        result[0] = x;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        Insert_at_the_Start_of_an_Array in = new Insert_at_the_Start_of_an_Array();
        int[] result = in.sortStart(nums, 32);
        System.out.println("mang trc khi in la:");
        System.out.println(nums[2]);
    }
}
