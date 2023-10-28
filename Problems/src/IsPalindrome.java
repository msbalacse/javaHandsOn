import java.util.Scanner;

public class IsPalindrome {

    static String palindromeCheck(String str){
        int start = 0;
        int end = (int)str.length() - 1;
        String strLower = str.toLowerCase();
        while (start < end){
            if(strLower.charAt(start)!=strLower.charAt(end)){
                return "it is not a Palindrome";
            }
            start++;
            end--;
        }
        return  "it is Palindrome";
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("------ Check Palindrome or not give a String value ------");
        System.out.println("Enter the Name (or) Something sentence : ");
        String str = read.next();
        System.out.println(palindromeCheck(str));
    }
}
