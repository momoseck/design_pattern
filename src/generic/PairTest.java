package generic;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, String> p1 = new PairImpl<String, String>("Even", "after");//Explicit type argument String, Integer can be replaced with <>
        Pair<String, String>  p2 = new PairImpl<>("hello", "world");
        Pair<String, Integer>  p3 = new PairImpl<>("hello", 2);
        //
        Pair<String, Box<String>> pair = new PairImpl<>("test",new Box<>());


        boolean same = Util.compare(p1, p2);
    }
}
