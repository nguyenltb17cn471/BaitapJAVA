import java.util.Scanner;

public class SoFibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,input;
        t = sc.nextInt();
        while (t>0) {
            t--;
            input = sc.nextInt();
            soFibonacci(input);
        }
    }

    public static void soFibonacci(int n) {
        long[] F = new long[90];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        System.out.print(F[n]);
    }
}
