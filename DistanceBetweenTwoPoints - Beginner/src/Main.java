import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double x1, x2, y1, y2, distance;

        x1 = Double.parseDouble(read.next());
        y1 = Double.parseDouble(read.next());
        x2 = Double.parseDouble(read.next());
        y2 = Double.parseDouble(read.next());
        distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)); // first time using Math.pow and sqrt

        System.out.printf("%.4f\n", distance);
    }
}