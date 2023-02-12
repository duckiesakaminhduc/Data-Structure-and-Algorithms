package ARRAY;
// int[] nums = { 2, 1, 3, 4, 0 };

public class Squares_of_a_Sorted_Array {

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return sort(nums);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 4, 0 };
        Squares_of_a_Sorted_Array s = new Squares_of_a_Sorted_Array();
        int[] results = s.sortedSquares(nums);
        for (int i : results) {
            System.out.println(i);
        }
    }
}
