
import tools.Demo1;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class C {
    public void show() {
        System.out.println("in show");
    }
}

class D extends C {
    public void show() {
        System.out.println("In D's show method");
    }
}

public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        // System.out.println(obj.add(4, 5));

        D obj1 = new D();
        obj1.show();

        Demo1 ob1 = new Demo1();
        System.out.println(ob1.age);
    }
}
