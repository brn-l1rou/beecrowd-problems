import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int hour = Integer.parseInt(read.nextLine());
        int speed = Integer.parseInt(read.nextLine());
        double liters = (hour*speed)/12.0;
        System.out.printf("%.3f\n", liters);
    }

}