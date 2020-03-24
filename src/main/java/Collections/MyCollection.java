package Collections;

import java.util.List;
import java.util.stream.IntStream;

public class MyCollection {
    Integer[] array;

    public MyCollection() {
        this.array = new Integer[0];
    }

    public void add(Integer integer){
        int counter = 0;
        Integer[] tempArray = new Integer[array.length+1];
        for(Integer element : array){
            tempArray[counter] = array[counter];
            counter ++;
        }
        array = tempArray;
        array[counter] = integer;
    }

    public void remove(int index){
        Integer[] tempArray = new Integer[array.length-1];

        array[index] = null;
        for(int i = 0; i < index; i++){
            tempArray[i] = array[i];
        }
        for(int i = index + 1; i < array.length; i++){
            tempArray[i-1] = array[i];
        }
        array = tempArray;
    }

    public Integer get(int index){
        return array[index];
    }

    public String toString(){
        String string = "";
        for (Integer integer : array) {
            string += integer + " ";
        }
        return string;
    }


}
