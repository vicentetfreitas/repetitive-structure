import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int type = sc.nextInt();

        while (type != 4) {
            if (type == 1) {
                alcohol ++;
            }
            else if (type == 2) {
                gasoline ++;
            }
            else if (type == 3) {
                diesel ++;
            }

            type = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
