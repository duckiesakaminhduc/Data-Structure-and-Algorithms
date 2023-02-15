import java.util.Arrays;

public class duplicate_zeros {
    // int[] arr = { 1, 0, 2, 3 };

    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                // dich tat ca phan tu sau 0 sang phai
                for (int j = n - 2; j >= i + 1; j--) {
                    arr[j + 1] = arr[j];
                }
                if (i + 1 < n) {
                    arr[i + 1] = 0;
                    i++;
                }
            }

        }
    }

    public static void main(String[] args) {
        duplicate_zeros d = new duplicate_zeros();
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 6 };
        d.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
