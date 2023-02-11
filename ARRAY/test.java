package ARRAY;

public class test {
    int count = 0;
    public boolean count_digits(int num) {
        while (num >= 1) {
            count++;
            num = num / 10;
        }
        if (count % 2 == 0)
            return true;
            return false;
    }
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.count_digits(101));
    }
}
