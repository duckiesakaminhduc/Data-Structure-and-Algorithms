package ARRAY;

public class Find_Numbers_with_Even_Number_of_Digits {

    public boolean count_digits(int num) {
        int count = 0;
        while (num >= 1) {
            count++;
            num = num / 10;
        }
        if (count % 2 == 0)
            return true;
        return false;
    }

    int count = 0;

    public int findNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
             if (count_digits(nums[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 435, 1, 2345,1111 };
        Find_Numbers_with_Even_Number_of_Digits f = new Find_Numbers_with_Even_Number_of_Digits();
        System.out.println(f.findNumbers(nums));
    }
}
