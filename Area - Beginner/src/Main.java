import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double A, B, C, resultA, resultB, resultC, resultD, resultE;

        A = Double.parseDouble(read.next());
        B = Double.parseDouble(read.next());
        C = Double.parseDouble(read.next());

        resultA = (A*C)/2;
        resultB = 3.14159 * (C*C);
        resultC = (A+B) * (C/2);
        resultD = B*B;
        resultE = A*B;

        System.out.printf("TRIANGULO: %.3f\n", resultA); // triangle
        System.out.printf("CIRCULO: %.3f\n", resultB); // circle
        System.out.printf("TRAPEZIO: %.3f\n", resultC); // trapezium
        System.out.printf("QUADRADO: %.3f\n", resultD); // square
        System.out.printf("RETANGULO: %.3f\n", resultE); // rectangle
    }
}