import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class DemoStreams {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4, 5, 7, 3, 2, 6);

        // int sum = 0;
        // for (int i : lst) {
        // if (i % 2 == 0) {
        // i = i * 2;
        // sum += i;
        // }
        // }

        // Consumer<Integer> con = (Integer t) -> System.out.println(t);
        Consumer<Integer> con = t -> System.out.println(t);

        // lst.forEach(con);
        // lst.forEach(t -> System.out.println(t));

        Stream<Integer> s = lst.stream();
        Stream<Integer> s1 = s.filter(n -> n % 2 == 0);
        // s.forEach(con);
        // s1.forEach(con);

        int res = lst.stream().filter(n -> n % 2 == 0).reduce(0, (c, e) -> c + e);
        System.out.println(res);

        // System.out.println(sum);
    }
}
