import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        int a,b, gcd = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        a = in.nextInt();
        System.out.println("Enter the second no: ");
        b = in.nextInt();

        int n = Math.min(a,b);

        for (int i=2; i<n; i++){
            while (a%i == 0 && b%i==0){
                gcd *= i;
                a /= i;
                b /= i;
            }
        }

        System.out.println("Greatest Common Divisor: "+ gcd);
    }
}
