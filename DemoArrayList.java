import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();

        // add operation
        lst.add(10);
        lst.add(15);
        lst.add(12);
        lst.add(20);

        // add at particular index
        lst.add(1, 25);

        // addAll
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(90);
        lst2.add(100);
        lst2.add(125);
        lst.addAll(lst2);

        // clear
        lst.clear();

        // contains
        System.out.println(lst.contains(29));

        // forEach
        lst.forEach(i -> System.out.println(i));

        // get
        System.out.println(lst.get(3));

        // set
        lst.set(6, 110);

        // size
        System.out.println(lst.size());

        // indexOf
        System.out.println(lst.indexOf(100));
        System.out.println(lst.indexOf(400));

        // isEmpty
        System.out.println(lst.isEmpty());

        // remove
        lst.remove(7);

        // iterator
        Iterator<Integer> it = lst.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // toArray
        System.out.println(Arrays.toString(lst.toArray()));

        // custom sorting using Comparator interface
        Comparator<Integer> cm = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Collections.sort(lst, cm);

        System.out.println();

        System.out.println(lst);

    }
}
