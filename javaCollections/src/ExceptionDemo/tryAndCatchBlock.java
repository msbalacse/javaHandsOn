package ExceptionDemo;

import java.util.Scanner;

public class tryAndCatchBlock {
    public static void main(String[] args) {
        int a, b, c;
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the two number : ");

        a = read.nextInt();
        b = read.nextInt();

        try {
            c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Check out the input values " + a+" "+b); // we could only access the initialized variables
        }
    }
}
