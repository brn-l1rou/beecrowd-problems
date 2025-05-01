import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int N = Integer.parseInt(read.nextLine());

        int hour = N/3600;
        int minutes = (N%3600)/60;
        int seconds = N%60;

        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}