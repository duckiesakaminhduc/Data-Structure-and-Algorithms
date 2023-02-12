package ARRAY;

public class test {
    int temp;

    public void swap(int a, int b) {
        a = temp;
        temp = b;
        b = a;
    }

    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[i + 1]) {
                swap(nums[i], nums[i + 1]);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        test t = new test();
        int[] nums = {2,1,3,4,0};
        
        // System.out.println(t.sort(nums));
    }
}
