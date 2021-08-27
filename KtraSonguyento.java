import java.util.Scanner;

public class KtraSonguyento {
    public static void main(String[] args) {
        int t,n;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t>0){
            t=t-1;
            n = scanner.nextInt();
            if(isNgTo(n)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }

    public static boolean isNgTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
