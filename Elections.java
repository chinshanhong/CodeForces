import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            if(a >= b && a >= c){
                b = (a - b == 0) ? 1 : (a - b + 1);
                c = (a - c == 0) ? 1 : (a - c + 1);
                if(b == 1 || c == 1){
                    a = 1;
                }
                else{
                    a = 0;
                }
            }
            else if(b >= a && b >= c){
                a = (b - a == 0) ? 1 : (b - a + 1);
                c = (b - c == 0) ? 1 : (b - c + 1);
                if(a == 1 || c == 1){
                    b = 1;
                }
                else{
                    b = 0;
                }
            }
            else if(c >= a && c >= b){
                a = (c - a == 0) ? 1 : (c - a + 1);
                b = (c - b == 0) ? 1 : (c - b + 1);
                if(a == 1 || b == 1){
                    c = 1;
                }
                else{
                    c = 0;
                }
            }
            System.out.println(a + " " + b + " " + c);
        }
    }
}
