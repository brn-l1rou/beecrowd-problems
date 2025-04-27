import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double radius, volume;
        Scanner read = new Scanner(System.in);
        radius = Double.parseDouble(read.nextLine());
        volume = (4/3.0) * 3.14159 * (radius*radius*radius);
        System.out.printf("VOLUME = %.3f\n", volume);

    }

}