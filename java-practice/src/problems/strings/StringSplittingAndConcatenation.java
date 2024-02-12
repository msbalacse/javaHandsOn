package problems.strings;

public class StringSplittingAndConcatenation {

    private static String[] SplitStringAndConcate(String str){
        return str.split("-");
    }
    public static void main(String[] args) {
        String str = "asdf-adf-adf-xcvb-ertwe-343-dsfg";

        String result = "";

        for (String s: SplitStringAndConcate(str)
             ) {
            result+=s;
        }
        System.out.println(result);
    }
}
