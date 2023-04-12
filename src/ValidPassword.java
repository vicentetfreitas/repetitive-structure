import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pass = sc.nextInt();

        while (pass != 2002){
            System.out.println("Senha Invalida");
            pass = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
