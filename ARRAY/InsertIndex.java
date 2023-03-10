import java.util.Arrays;

public class InsertIndex {

    int[] insertIndex(int[] nums, int x, int y) {
        int[] re = Arrays.copyOf(nums, nums.length + 1);
        for (int i = nums.length - 1; i >= x; i--) {
            re[i + 1] = nums[i];
        }
        re[x] = y;
        return re;
    }

    public static void main(String[] args) {
        InsertIndex in = new InsertIndex();
        int[] nums = {1,0,2,3};
        int[] re = in.insertIndex(nums, 2, 0);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(re));

    }
}