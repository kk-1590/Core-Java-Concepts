import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();

        // addFirst
        lst.addFirst(5);
        lst.addFirst(10);
        lst.addFirst(35);

        // addLast
        lst.addLast(42);
        lst.addLast(60);
        lst.addLast(100);

        // getFirst, getLast
        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());

        // get
        System.out.println(lst.get(4));

        // set
        lst.set(2, 90);

        // size
        System.out.println(lst.size());

        // indexOf
        System.out.println(lst.indexOf(42));

        // removeFirst, removeLast
        System.out.println(lst.removeFirst());
        System.out.println(lst.removeLast());

        System.out.println(lst);
    }
}
