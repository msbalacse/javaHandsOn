package dsa.L8;

import java.util.ArrayList;
import java.util.Arrays;

public class Add2Array {
    public static void main(String[] args) {
        int[] one = {9,9};
        int[] two = {9,9,9};

        System.out.println(AddTwoArray(one,two));
    }

    public static ArrayList<Integer> AddTwoArray(int[] one, int[] two){
        ArrayList<Integer> res = new ArrayList<>();

        int i = one.length - 1;
        int j = two.length - 1;

        int carry = 0;

        while (i>=0 || j>=0){
            int sum =0;

            if(i>=0){
                sum+=one[i];
            }

            if(j>=0){
                sum+=two[j];
            }

            sum+=carry;

            res.add(0,sum%10);
            carry=sum/10;

            i--;
            j--;
        }

        if(carry != 0){
            res.add(0,carry);
        }

        return res;
    }
}
