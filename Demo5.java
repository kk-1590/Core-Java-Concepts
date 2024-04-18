
//class - class -> extends
//class - interfcae -> implements
//interfcae - interface -> extends

//Types of interfaces
//Normal
//Functional(SAM --> Single abstract method)
//Marker --> empty interface

interface Computer {
    public abstract void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code,compile");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code,compile,faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

interface A {

    int age = 30; // final and static
    String area = "Mumbai";

    public abstract void show();

    public abstract void config();
}

interface X {
    void run();
}

interface Y extends X {

}

// a class can implements multiple interfaces
class B implements A, X {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }
}

// enum
enum Status {
    Running, Failed, Pending, Success;
}

enum Laptops {
    Macbook(2200), XPS(2000), Surface(2500), ThinkPad(2400);

    private int price;

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer obj = new Developer();
        obj.devApp(desk);

        A obj1 = new B();
        // obj1.show();
        // obj1.config();

        // Status s = Status.Running;
        // Status[] s1 = Status.values();
        // System.out.println(s.ordinal());
        // System.out.println(s1[2]);

        Status s = Status.Pending;

        // if (s == Status.Pending) {
        // System.out.println("Please wait");
        // }

        switch (s) {
            case Running:
                System.out.println("running");
                break;
            case Pending:
                System.out.println("pending");
                break;
            default:
                System.out.println("Done");
                break;
        }

        Laptops lap1 = Laptops.Macbook;
        System.out.println(lap1.getPrice());
    }
}
