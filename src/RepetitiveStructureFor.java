import java.util.Scanner;

public class RepetitiveStructureFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println(sum);
        sc.close();
    }
}
