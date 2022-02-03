import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < t; i++){
            String input = scanner.nextLine();
            if(input.length() % 2 != 0){
                System.out.println("NO");
            }
            else{
                String s1 = input.substring(0, input.length() / 2);
                String s2 = input.substring(input.length() / 2);
                System.out.println(s1.equals(s2) ? "YES" : "NO");
            }
        }
    }
}
