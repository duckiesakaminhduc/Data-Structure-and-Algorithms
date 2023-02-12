public class test {

    // swap 2 phan tu tai vi tri i va j
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //sort mang tang dan 
    int[] sortASC(int[] nums) {
        for (int i : nums) {
            for (int j : nums) {
                if (nums[i] > nums[j])
                    swap(nums, i, j);
            }
        }
        return nums;
    }


    // thuc hien yeu cau de bai
    int[] sortSquare(int[]  nums) {
        for (int i : nums) {
           nums[i] = nums[i] * nums[i]; 
        }
        return sortASC(nums);
    }

    public static void main(String[] args) {
        int[] nums = { -4,-1,0,3,10};
        test t = new test();
        int[] result = t.sortSquare(nums);
        System.out.println("mang sau khi sap xep tang dan la:");
        for (int i : result) {
            System.out.println(i +' ');
        }
    }
}

