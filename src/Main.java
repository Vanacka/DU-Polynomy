import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) {
            double kokot = sc.nextDouble();
        }
        double[] kokoti = new double[n + 1];

        for (int i = 0; i <= n; i++) {
            kokoti[n - i] = sc.nextDouble();
        }

        for (int i = n; i > 0; i--) {
        }
    }
}
