
public class MaxconsicutiveOnes {
    /* cach so 1 */
 /* 
    public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
    count++;
    } else {
    if (count > max)
    max = count;
    count = 0;
    }
    if (count > max)
    max = count;
    }
    return max;
    }
*/
    /* cach so 2 */
    int count = 0;
    int max = 0;

    public int findMaxConsecutiveOnes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 };
        MaxconsicutiveOnes m = new MaxconsicutiveOnes();
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }
}
