import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int noOfProblems = in.nextInt();
        int total = 0;
        while(noOfProblems-- > 0){
            int Petya = in.nextInt();
            int Vasya = in.nextInt();
            int Tonya = in.nextInt();

            int count = 0;

            if(Petya > 0){
                count++;
            }
            if(Vasya > 0){
                count++;
            }
            if(Tonya > 0){
                count++;
            }
            if(count >= 2){
                total++;
            }
        }

        System.out.println(total);

    }
}
