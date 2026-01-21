public class RecursionDemo {
    static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }

    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int sum(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {2,4,6,8};
        System.out.println(fact(5));
        System.out.println(fib(6));
        System.out.println(sum(a, 0));
    }
}