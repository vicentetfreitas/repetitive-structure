import java.util.Scanner;

public class NumberOfLineSquareECube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%d %d %d%n", i, square, cube);
        }

        sc.close();
    }
}
