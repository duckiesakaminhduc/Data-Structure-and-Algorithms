import java.util.Arrays;

public class Inserting_at_the_End_of_an_Array {
    /*
     * int[] insertEnd(int[] nums, int x) {
     * int l = nums.length;
     * int[] temp = new int[l + 1];for(
     * int i = 0;i<l;i++)
     * {
     * temp[i] = nums[i];
     * }temp[l]=x;return temp;
     * }
     */
    int[] insertEndarray(int[] nums, int x) {
        int[] result = Arrays.copyOf(nums, nums.length + 1);
        result[nums.length] = x;
        return result;
    }

    public static void main(String[] args) {
        Inserting_at_the_End_of_an_Array in = new Inserting_at_the_End_of_an_Array();
        int[] a = { 1, 3, 5, 4, 7 };
        /* ----------------- */
        int[] temp = in.insertEndarray(a, 111);
        System.out.println("mang truoc khi chen la:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        /*------------------ */
        System.out.println("mang sau khi chen la:");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}
