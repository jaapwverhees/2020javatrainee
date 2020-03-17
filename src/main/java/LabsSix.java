import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LabsSix {

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
}
