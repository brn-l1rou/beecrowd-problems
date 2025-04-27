import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int A, B, SOMA;
        Scanner read = new Scanner(System.in);
        A = Integer.parseInt(read.nextLine());
        B = Integer.parseInt(read.nextLine());
        SOMA = A+B;
        System.out.println("SOMA = " + SOMA);
    }
}