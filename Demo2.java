//final keyword - variable, method, class

class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C {
    final public void show() {
        System.out.println("In C show method");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class D extends C {
    // public void show() {
    // System.out.println("By Jon");
    // }
}

public class Demo2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        final int num = 8;
        // num = 9;
        System.out.println(num);

        D obj1 = new D();
        obj1.show();
    }
}
