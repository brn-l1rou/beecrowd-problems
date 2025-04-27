import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int A, B, C, D, DIFERENCA;
        Scanner read = new Scanner(System.in);

        A = Integer.parseInt(read.nextLine());
        B = Integer.parseInt(read.nextLine());
        C = Integer.parseInt(read.nextLine());
        D = Integer.parseInt(read.nextLine());
        DIFERENCA = (A*B) - (C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}