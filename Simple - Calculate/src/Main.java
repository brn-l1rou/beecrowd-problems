import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int code1, num1, code2, num2;
        float value1, value2, totalToPay;
        Scanner read = new Scanner(System.in);

        code1 = read.nextInt();
        num1 = read.nextInt();
        value1 = Float.parseFloat(read.next());
        code2 = read.nextInt();
        num2 = read.nextInt();
        value2 = Float.parseFloat(read.next());

        totalToPay = (num1 * value1) + (num2 * value2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalToPay);

    }
}