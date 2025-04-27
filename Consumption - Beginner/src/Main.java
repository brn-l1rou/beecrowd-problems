import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int distance;
        double liters, consumption;

        distance = Integer.parseInt(read.nextLine());
        liters = Double.parseDouble(read.nextLine());

        consumption = distance/liters;

        System.out.printf("%.3f km/l\n", consumption);
    }
}