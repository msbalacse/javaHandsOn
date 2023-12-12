package com.gfg;

public class FindTheLastDigitOfBaseExponentValue {
    static int getLastDigit(String a, String b) {


        if(b.length() == 1 && b.equals("0"))
            return 1;

        if(a.equals("1"))
            return 1;

        int exponent = (Modulo(4 , b) == 0 ? 4 : Modulo(4 , b));

        int result  = (int)(Math.pow(a.charAt(a.length()-1)-'0' , exponent));
        return result%10;

    }


    private static int Modulo (int a , String b){

        int res = 0;

        for(int i = 0 ; i < b.length() ; i++)
        {
            res = (res*10 +b.charAt(i)-'0') %a;

        }

        return res;

    }
    public static void main(String[] args) {
        System.out.println(getLastDigit("67","633"));
    }
}
