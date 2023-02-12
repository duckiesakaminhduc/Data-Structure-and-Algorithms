import java.util.Vector;

public class test {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] % 2 == 0) {
                vec.add(nums[i]);
            }
        }

        System.out.println(vec);

    }
}
