import java.util.Locale;
import java.util.Scanner;

public class interval{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       do{
        System.out.print("Type a number between 0 and 100:");
        double num = sc.nextDouble();

        if (num < 0.0 || num > 100.0) {
            System.out.println("Please type a valid number!");
        }
        else if (num <= 25.0) {
            System.out.println("Interval [0,25]");
        }
        else if (num <= 50.0) {
            System.out.println("Interval (25,50]");
        }
        else if (num <= 75.0) {
            System.out.println("Interval (50,75]");
        }
        else {
            System.out.println("Interval (75,100]");
        }

        System.out.print("Do you want to try again? (yes/no): ");
    } while (sc.next().equalsIgnoreCase("yes"));

        sc.close();

    }
}