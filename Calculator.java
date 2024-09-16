
//A calculator
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Choose a option ");
        System.out.println("1 Addition\n 2 Substraction \n 3 multiplication\n 4 Division");
        Scanner omn = new Scanner(System.in);
        int option = omn.nextInt();
        System.out.println("Your choosed option is:" + option);
        if (option == 1) {
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            System.out.println("First number is:" + a);
            int b = scn.nextInt();
            System.out.println("Second number is:" + b);
            int sum = a + b;
            System.out.println("Addition of two number is:" + sum);

        } else if (option == 2) {
            int a = omn.nextInt();
            System.out.println("First number is:" + a);
            int b = omn.nextInt();
            System.out.println("Second number is:" + b);
            int sub = a - b;
            System.out.println("Substraction of two Number is :" + sub);

        } else if (option == 3) {
            int a = omn.nextInt();
            System.out.println("First number is:" + a);
            int b = omn.nextInt();
            System.out.println("Second number is:" + b);
            int mul = a * b;
            System.out.println("Multiplication of two number is:" + mul);
        } else if (option == 4) {
            int a = omn.nextInt();
            System.out.println("First Number is:" + a);
            int b = omn.nextInt();
            System.out.println("second number is:" + b);
            int div = a / b;
            System.out.println("Division of two numbers:" + div);
        } else {
            System.out.println("Something went Wrong!");
        }

    }
}
