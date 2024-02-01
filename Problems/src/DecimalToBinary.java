public class DecimalToBinary {

    static String binary(int n){
        String str = "";
        while (n > 0){
            str = n%2 + str;
            n /= 2;
        }
        return str;
    }

    static int binaryToDecimal(int n){
        int result = 0;
        int base = 1;

        int temp = n;

        while ( n > 0){
            int lastDigit = n % 10;
            n /= 10;

            result += lastDigit * base;
            base *= 2;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(binary(13));
        System.out.println(binaryToDecimal(1101));
    }
}
