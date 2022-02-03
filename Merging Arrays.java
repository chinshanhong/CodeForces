import java.util.Scanner;

public class Merging_Arrays {
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

        mergeArray(a, b);
    }

    public static void mergeArray(int[] a , int[] b){
        int i = 0, j = 0;

        while(i < a.length || j < b.length){
            if(j == b.length || (i < a.length && a[i] < b[j])){
                System.out.print(a[i++] + " ");
            }
            else{
                System.out.print(b[j++] + " ");
            }
        }
    }
}
