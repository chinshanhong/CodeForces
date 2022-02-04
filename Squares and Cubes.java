import java.util.Scanner;

public class Squares_and_Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int count = (int)Math.floor(Math.sqrt(n)) + (int)Math.floor(Math.cbrt(n)) - (int)Math.floor(Math.sqrt(Math.cbrt(n)));
            System.out.println(count);
        }
    }
}
