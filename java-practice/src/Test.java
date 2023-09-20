import java.util.Scanner;

public class Test {
    public static void main(String args[] ) throws Exception {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
