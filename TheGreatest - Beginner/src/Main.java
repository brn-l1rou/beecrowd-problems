import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, c, MaiorAB;
        Scanner read = new Scanner(System.in);

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();

        MaiorAB = (a + b + Math.abs(a-b))/2; // Takes the Greatest between a and b

        if(MaiorAB > c){
            System.out.println(MaiorAB + " eh o maior"); // Shows the Greatest between a and b
        }else{
            System.out.println(c + " eh o maior"); // shows c
        }
    }
}