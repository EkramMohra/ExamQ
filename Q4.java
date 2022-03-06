import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int x, n;
        double eq = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x num");
        x = sc.nextInt();
        System.out.println("enter n num");
        n = sc.nextInt();
        int j = 1;
        for (int i = 2; i <= 2 * n; i += 2) {
            if (j % 2 != 0) {
                eq += -(Math.pow(x, i) / fac(j));
            } else {
                eq += Math.pow(x, i) / fac(j);
            }
            j++;
        }
        System.out.println(eq);
    }

    public static int fac(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
