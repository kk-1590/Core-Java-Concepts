@FunctionalInterface
interface A {
    void show(int i);
}

class B implements A {
    public void show(int i) {
        System.out.println("in show");
    }
}

public class FuncInterface {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show() {
        // System.out.println("in show");
        // }
        // };

        // Lambda expression
        A obj = (i) -> System.out.println("in show" + " " + i);

        obj.show(5);
    }
}
