import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int num1, num2, PROD;
        Scanner read = new Scanner(System.in);
        num1 = Integer.parseInt(read.nextLine());
        num2 = Integer.parseInt(read.nextLine());
        PROD = num1*num2;

        System.out.println("PROD = " + PROD);
    }
}