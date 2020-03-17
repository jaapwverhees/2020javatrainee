public class LabsFive {

    public int greatest(int one, int two) {
        return Math.max(one, two);
    }

    public String greatestLength(String one, String two) {
        return one.length() > two.length() ? one : two;
    }

    public int greatestNumber(int... values) {
        int greatest = values[0];

        for (int i = 1; i < values.length; i++) {
            greatest = Math.max(greatest, values[i]);
        }
        return greatest;
    }

    public int factorial(int n) {
        if (n != 0)
            return n * factorial(n - 1); // recursive call
        else
            return 1;
    }
}
