import java.util.Locale;
import java.util.Scanner;

public class AverageWeightedTestCase {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double mediaWeighted;

        for (int i = 0; i < n; i++){

            double value1 = sc.nextDouble();
            double value2 = sc.nextDouble();
            double value3 = sc.nextDouble();

            mediaWeighted = ((value1 * 2.0) + (value2 * 3.0) + (value3 * 5.0))/10.0;

            System.out.printf("%.1f%n", mediaWeighted);
        }

        sc.close();
    }
}
