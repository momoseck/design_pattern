package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        IntStream  intStream = IntStream.range(10,20);
        intStream.forEach(el->System.out.println(el));
        Stream<String> generatedStream = Stream.generate(() -> "pqr").limit(20);
        generatedStream.forEach(str->System.out.println(str));

        Stream<String> streamBuilder = Stream.<String>builder().add("p").add("q").add("r").build();
    }
}
