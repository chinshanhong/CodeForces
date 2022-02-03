import java.util.Scanner;

public class Number_of_Smaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < b.length; i++){
            b[i] = scanner.nextInt();
        }

        int j = 0;
        for(int i : b){
            while(j < a.length && a[j] < i){
                j++;
            }
            System.out.print(j + " ");
        }
    }
}
