public class HomeworkFour {

    public String hotOrNot(Season e){
        return e.getDescription();
    }

    public void hourglass(int n) {
        String s = "";
        if(n ==0) throw new IllegalArgumentException();
        for (int i = 0; i < n; i++) s += " *";
        String w = "";
        for (int i = 0; i < n; i++) w += " ";

        for (int i = n; i > 0; i--) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
        for (int i = 2; i <= n; i++) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
    }
}
