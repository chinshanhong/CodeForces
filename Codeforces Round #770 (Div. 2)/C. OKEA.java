import java.util.Scanner;

public class OKEA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if(k == 1){
                System.out.println("YES");
                for(int j = 1; j <= n; j++){
                    System.out.println(j);
                }
                continue;
            }

            if(n % 2 == 1){
                System.out.println("NO");
                continue;
            }

            int[][] mat = new int[n][k];
            int cur = 0;

            System.out.println("YES");

            for(int j = 0; j < k; j++){
                for(int a = 0; a < n; a++){
                    mat[a][j] = ++cur;
                }
            }

            for(int j = 0; j < n; j++){
                for(int a = 0; a < k; a++){
                    System.out.print(mat[j][a] + " ");
                }
                System.out.println();
            }
        }
    }
}
