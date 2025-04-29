import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int distanceInput, minutes;

        distanceInput = Integer.parseInt(read.nextLine());
        minutes = (60*distanceInput) / 30;
        System.out.println(minutes + " minutos"); // minutes
    }
}