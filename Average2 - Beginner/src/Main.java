import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double A, B, C, MEDIA; // MEDIA = Average

        A = Double.parseDouble(read.nextLine());
        B = Double.parseDouble(read.nextLine());
        C = Double.parseDouble(read.nextLine());

        MEDIA = ((A*2)+(B*3)+(C*5))/(2+3+5);

        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}