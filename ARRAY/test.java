
public class test {

    public static void main(String[] args) {
        int[] t = { 1, 2, 3 ,4};
        for (int i = 3; i >= 0; i--) {
            t[i + 1] = t[i];
        }
        t[0] = 20;

        // Now that we have created space for the new element,
        // we can insert it at the beginning.
        for (int i : t) {
            System.out.println(i);
        }
    }
}
