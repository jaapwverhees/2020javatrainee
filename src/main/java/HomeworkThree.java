public class HomeworkThree {
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
    public int calculateHours(int start, int increment) {
        return (start + increment) % 24;
    }

    public int convertbinaryToInt(String a) {
        return Integer.parseInt(a, 2);
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
}


