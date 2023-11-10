
public class Main {
    public static void main(String[] args) {
        FibonacciUtils fibonacciUtils = new FibonacciUtils();
        long iterative = fibonacciUtils.iterativeFibonacci(10);
        long recursion = fibonacciUtils.recursionFibonacci(10);
        long dynamic = fibonacciUtils.dynamicFibonacci(10);
        System.out.println(iterative + " " + recursion + " " + dynamic);
    }
}
