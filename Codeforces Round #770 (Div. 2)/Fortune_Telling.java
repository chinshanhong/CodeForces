import java.util.Scanner;

public class Fortune_Telling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            long a = scanner.nextLong();
            long b = a + 3;
            long y = scanner.nextLong();

            long sum = 0;

            for(int j = 0; j < n; j++){
                sum ^= scanner.nextLong();
                //second approach
                // sum += scanner.nextLong();
            }
            //second approach
            //if((a + sum) % 2 == y % 2)
            if((a ^ sum) % 2 == y % 2){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
        }
    }
}
