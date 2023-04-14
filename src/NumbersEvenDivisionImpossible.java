import java.util.Locale;
import java.util.Scanner;

public class NumbersEvenDivisionImpossible {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() ;;

        for (int i = 0; i < n; i++){

             int x = sc.nextInt();
             int y = sc.nextInt();

             double division = (double) x / y;

             if(y == 0){
                 System.out.println("divisao impossivel");
             }else{
                 System.out.printf("%.1f%n", division);
             }

        }

        sc.close();
    }
}
