import java.util.Arrays;

public class LabsFour {
    //werkt nog niet
    public boolean bankNumberIsValid(int[] array) throws IllegalArgumentException {
        int sum = 0;
        int counter = 9;
        int[] newArray = new int[9];
        for (int i = 0; i < 9; i++) {
            newArray[i] = counter * array[i];
            //System.out.println(String.format("%s * %s = %s", counter, array[i], counter * array[i]));
            counter--;
        }
        System.out.println(Arrays.toString(newArray));
        for (int element : newArray) {
            sum += element;
        }
        System.out.println(sum);
        if (sum % 11 == 0) return true;
        else throw new IllegalArgumentException("Big Oof");
    }
}
