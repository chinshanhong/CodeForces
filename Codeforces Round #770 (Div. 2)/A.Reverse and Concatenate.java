import java.util.Scanner;

public class ReverseAndConcatenate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scan.nextInt();
            int k = scan.nextInt();
            scan.nextLine();
            String s = scan.nextLine();

            if(k == 0){
                System.out.println(1);
                continue;
            }

            String temp = reverseString(s);
            int count = 1;


            for(int j = 0; j < k; j++){
                if(temp.equals(s)){
                    break;
                }
                else{
                    count++;
                    s += temp;
                    temp = s;
                }
            }
            System.out.println(count);
        }
    }

    public static String reverseString(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }
}
