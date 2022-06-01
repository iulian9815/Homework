public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.inc(2);
        System.out.println(counter.getCurrent());
    }
}