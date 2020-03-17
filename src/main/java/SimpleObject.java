public class SimpleObject {
    public SimpleObject() {
        super();
        System.out.println("Heap: " + this);
    }
    protected void finalize(){
        System.out.println("finalized: " + this);
    }
}
