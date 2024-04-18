abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("play music");
    }
}

// subclass of an abstract parent class have to implement all the abstract
// methods defined in the parent class else this subclass should also be
// declared abstract

class Audi extends Car { // concrete class
    public void drive() {
        System.out.println("Driving audi");
    }
}

class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

class C {
    public void show() {
        System.out.println("in C show");
    }
}

class D extends C {
    public void show() {
        System.out.println("in D show");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Car obj = new Audi();
        // obj.drive();
        // obj.playMusic();

        A obj1 = new A();
        obj1.show();

        A.B obj2 = new A.B();
        obj2.config();

        // ANonymous inner class
        C obj3 = new C() {
            public void show() {
                System.out.println("in new show");
            }
        };

        obj3.show();
    }
}
