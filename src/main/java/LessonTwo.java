import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LessonTwo {

    public int calculateHours(int start, int increment) {
        return (start + increment) % 24;
    }

    public int convertbinaryToInt(String a) {
        return Integer.parseInt(a, 2);
    }

    public int weirdAlgoritm(int i) {
        int j;
        if (i < 3) {
            j = i++ + ++i;
        } else {
            j = ++i >>> 1;
        }
        return j;
        //result = 2;
    }

    public String compareTheIs(int i) {
        int one = i;
        int two = i;

        one = one++; //resultaat voor ophoging
        two = ++two; //resultaat na ophoging
        return String.format("Copy result of i++ is %s, Copy result of ++i is %s", one, two);

        //one = 4
        //two = 5
    }


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

    public boolean bankNumberIsValid(int[] array) {
        int sum = 0;
        int[] newArray = new int[8];
        for (int i = 9; i > 1; i--) {
            for (int b = 0; b < 8; b++) {
                newArray[b] = i * array[b];
            }
            for (int counter : newArray) {
                sum += counter;
            }
        }
        if(sum % 11 == 0) return true;
        else throw new IllegalArgumentException();
    }

    public int[] storeInts() {
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("End");
        System.out.println(sum);
        return array;
    }

    public int[][] fillArray() {
        int[][] array = new int[3][3];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        int counter = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                array[x][y] = list.get(counter);
                counter++;
            }
        }
        return array;
    }

    public int[] doubleLengthArray(int[] input) {
        int[] output = new int[input.length * 2];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    public Long[] multiplyValuesinAnArray(Long[] input, int multiplier) {
        Long[] output = new Long[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i] * multiplier;
        }
        return output;
    }
    protected void finalized(){
        System.out.println("finalized" + this);
    }

}

