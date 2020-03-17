public class Fib {

    public int run(int n) {
        return run(1, n);
    }

    public int run(int start, int n) {
        return run(start, start, n);
    }

    public int run(int f1, int f2, int n) {
        int one = f1;
        int two = f2;
        int sum = one + two;

        System.out.print(one + " ");
        System.out.print(two + " ");

        for (int i = 0; i < n - 2; i++) {
            System.out.print(sum + " ");
            one = two;
            two = sum;
            sum = one + two;
        }
        System.out.println();
        return two;
    }

    public float guldenSnee(int n) {
        return (float) run(n) / run(n - 1);
    }

    private int fibRec(int n) {
        if (n <= 2) { return 1; }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public int printFibRecursive(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibRec(i) + " ");
        }
        return fibRec(n);
    }

}
