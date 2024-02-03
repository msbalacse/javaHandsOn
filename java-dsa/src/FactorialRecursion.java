public class FactorialRecursion {

    int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        FactorialRecursion obj = new FactorialRecursion();

        System.out.println(obj.factorial(3));

    }
}
