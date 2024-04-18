
class Calculator {
    int a;

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1) {
        return n1 * 3;
    }
}

class Student {
    int rollNo;
    String name;
    int marks;
}

class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
    }

    public void show() {
        System.out.println(brand + " " + name + " " + price);
    }

    public static void show1() {
        System.out.println("in static method");
    }
}

class Human {
    private int age;
    private String name;

    public Human() {
        // System.out.println("In contructor");
        age = 12;
        name = "John";
    }

    public Human(int age, String name) {
        // System.out.println("In contructor");
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("In B");
    }

    public B(int n) {
        // super(15);
        this();
        System.out.println("in B int");
    }
}

public class Hello {
    public static void main(String args[]) throws ClassNotFoundException {
        // Calculator c = new Calculator();
        // System.out.println(c.add(8));

        // // Multi-dimensional arrays

        // int nums[][] = new int[3][4];

        // // Jagged arrays
        // // we dont give the no of elements in each array

        // int numsJagged[][] = new int[3][];
        // numsJagged[0] = new int[3];
        // numsJagged[1] = new int[4];
        // numsJagged[2] = new int[5];

        // Student s1 = new Student();
        // s1.rollNo = 15;
        // s1.name = "Kartik";
        // s1.marks = 20;

        // Student s2 = new Student();
        // s2.rollNo = 15;
        // s2.name = "Aman";
        // s2.marks = 20;

        // Student s3 = new Student();
        // s3.rollNo = 15;
        // s3.name = "Amit";
        // s3.marks = 20;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " - " + students[i].rollNo);
        // }

        // String str = "Kartik";
        // str = "Jjhja";
        // String st = new String("kk");
        // System.out.println(st);
        // System.out.println(str);

        // Strings --> Strings are immutable
        // to work with mutable strings we can use StringBuilder or StringBuffer

        // StringBuffer sb = new StringBuffer("Navin");
        // System.out.println(sb.length());
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 15000;
        Mobile.name = "iPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Smasung";
        obj2.price = 50000;
        Mobile.name = "Galaxy S23";

        Mobile.name = "Phone";
        // obj1.show();
        // obj2.show();

        // Mobile.show1();
        // Class.forName("Mobile");
        Human obj = new Human();
        Human obj3 = new Human(8, "AK");
        // obj.age = 11;
        // obj.name = "Navin";
        // obj.setAge(15);
        // obj.setName("Kartik");
        // System.out.println(obj3.getAge());

        B objB = new B(9);
    }
}
