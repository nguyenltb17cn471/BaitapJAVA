import java.util.Scanner;

public class KTmangdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = n / 2;
            boolean b = true;
            for (int i = 0; i < m; i++) {

                if (a[i] != a[n - 1 - i]) {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                System.out.println("YES");
            } else
                System.out.println(("NO"));
        }
    }
}
