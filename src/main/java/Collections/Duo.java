package Collections;

public class Duo<E> {
    private E first;
    private E second;


    public Duo(E first, E second) {
        this.first = first;
        this.first = first;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public void swap() {
        E temp = second;
        second = first;
        first = temp;
    }
}
