import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        String name;
        double salary, valueSold;

        name = read.nextLine();
        salary = Double.parseDouble(read.nextLine());
        valueSold = Double.parseDouble(read.nextLine());

        salary += valueSold * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salary);
    }
}