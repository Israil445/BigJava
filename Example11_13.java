
import java.util.Scanner;

public class Example11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = 2;
        int allNumbers = 0;
        double sum = 0;

        while (times > 0) {
            try {
                System.out.print("Enter a number: ");
                double currentNumber = input.nextDouble();
                sum += currentNumber;
                allNumbers++;
            } catch (Exception e) {
                System.out.println("Enter valid number!");
                times--;
                String s= input.next();
            }
        }

        System.out.printf("Average of all numbers is: %.2f\n", sum / allNumbers);

        input.close();
    }
}
