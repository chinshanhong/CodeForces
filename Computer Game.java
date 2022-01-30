import java.util.Scanner;

public class Computer_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            scan.nextLine();
            char[][] grid = new char[2][n];
            for(int j = 0; j < grid.length; j++){
                grid[j] = scan.nextLine().toCharArray();
            }
            String answer = "YES";
            for(int j = 0 ; j < n - 1; j++){
                if(grid[0][j + 1] == '1' && grid[1][j + 1] == '1'){
                    answer = "NO";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
