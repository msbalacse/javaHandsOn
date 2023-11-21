package collection;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));


        int[] numbers = {100,200};
//        int[] numbers = new int[2];
//        numbers[0] = 100;
//        numbers[1] = 200;

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }
}
