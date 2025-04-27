import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int number, workedHours;
        float perHour, salary;
        Scanner read = new Scanner(System.in);

        number = Integer.parseInt(read.nextLine());
        workedHours = Integer.parseInt(read.nextLine());
        perHour = Float.parseFloat(read.nextLine());
        salary = workedHours * perHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}