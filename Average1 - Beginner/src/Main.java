import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double A, B, MEDIA; // MEDIA == Average

        A = Double.parseDouble(read.nextLine());
        B = Double.parseDouble(read.nextLine());
        // I Could add a verification that guarantee that the values are between 0 and 10
        // But for this exercise, beecrowd does not allow this
        MEDIA = ((A*3.5)+(B*7.5))/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
