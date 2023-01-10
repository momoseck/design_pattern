package generic;

public class Tarrays implements Comparable<Tarrays> {
    private int age;

    @Override
    public int compareTo(Tarrays o) {
        return this.age > o.age ? 1 : 0;
    }
}
