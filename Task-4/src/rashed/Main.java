package rashed;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        System.out.print("Please Enter the number : ");
        int a = input.nextInt();
        System.out.println("Sum of the Divisors = " +calculator.divisorSum(a));

        System.out.print("Please Enter the number : ");
        int b = input.nextInt();
        System.out.println("Factorial of the number = " +calculator.findFactorial(b));

    }
}
/**
 * Name: Rashed Ahmod
 * ID: 2012020123
 * Section: C
 * Email: cse_2012020123@lus.ac.bd
 * Date: 16/10/2021
 */
