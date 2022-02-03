import java.util.Scanner;

public class Number_of_Equal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }

        int p1 = 0, p2 = 0;
        long ans = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                int num1 = 1, num2 = 1;
                ++p1;
                while (p1 < n && a[p1] == a[p1 - 1]) {
                    ++num1;
                    ++p1;
                }
                ++p2;
                while (p2 < m && b[p2] == b[p2 - 1]) {
                    ++num2;
                    ++p2;
                }
                ans += 1L * num1 * num2;
            } else if (a[p1] < b[p2]) {
                ++p1;
                while ((p1 < n && a[p1] == a[p1 - 1])) ++p1;
            } else if (a[p1] > b[p2]) {
                ++p2;
                while (p2 < m && b[p2] == b[p2 - 1]) ++p2;
            }
        }
        System.out.println(ans);


    }
}
