class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop l) {
        return this.model == l.model;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        System.out.println(obj.toString());

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 2000;

        // System.out.println(obj.equals(obj1));

        double d = 4.5;
        int i = (int) d;
        // System.out.println(i);

        A objA = (A) new B();
        // objA.show1();

        B objB = (B) objA;
        // objB.show2();

        int num = 7;
        Integer num1 = 8;
        System.out.println(num1);
    }
}
