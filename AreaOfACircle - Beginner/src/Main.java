import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double n = 3.14159;
        double R;
        Scanner read = new Scanner(System.in);
        R = Double.parseDouble(read.nextLine());
        double A = n*(R*R);
        System.out.println("A=" + String.format("%.4f", A));
    }
}