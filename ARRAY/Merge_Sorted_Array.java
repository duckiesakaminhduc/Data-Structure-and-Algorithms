import java.util.Arrays;

public class Merge_Sorted_Array {
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

    int[] cutArray(int[] arr, int x) {
        int[] result = new int[x];
        for (int i = 0; i < x; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] re1 = cutArray(nums1, m);
        int[] re2 = cutArray(nums2, n);
        int[] re = new int[m + n];
        int t = 0;
        for (int i = 0; i < m; i++) {
            re[i] = re1[i];
        }
        for (int j = m; j < m + n; j++) {
            re[j] = re2[t];
            t++;
        }
        return sort(re);
    }

    public static void main(String[] args) {
        Merge_Sorted_Array m = new Merge_Sorted_Array();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        int[] re = m.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(re));
    }
}
