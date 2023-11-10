import java.util.HashMap;
import java.util.Map;

/*
iterativeFibonacci:
Просторова складність: O(1) (константна)
Часова складність: O(n) (лінійна)
recursionFibonacci:
Просторова складність: O(n) (рекурсивний стек займає простір на кожному виклику(при великих значеннях n може переповнити оперативку))
Часова складність: O(2^n) (експоненційна)
dynamicFibonacci:
Просторова складність: O(n) (рекурсивний стек може досягає n, мемоізації це зменшує)
Часова складність: O(n) (динамічне програмування забезпечує оптимізацію до лінійної складності при повторному використанні методу)
*/
public class FibonacciUtils {
    private Map<Integer, Long> memo = new HashMap<>();
    public long iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fibPrev = 0;
        long fibCurrent = 1;
        for (int i = 2; i <= n; i++) {
            long fibNext = fibPrev + fibCurrent;
            fibPrev = fibCurrent;
            fibCurrent = fibNext;
        }

        return fibCurrent;
    }
    public long recursionFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }
    public long dynamicFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = dynamicFibonacci(n - 1) + dynamicFibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }
}
