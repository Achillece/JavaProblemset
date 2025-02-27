package test;

public class EvenOddBit {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int i = 0;
        while (n > 0) {
            if (i % 2 == 0) {
                even += n & 1;
            } else {
                odd += n & 1;
            }
            n >>= 1;
            i++;
        }
        return new int[] { even, odd };
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println(a ^ 1);
    }
}
