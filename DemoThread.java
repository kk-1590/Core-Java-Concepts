//synchronized keyword

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

class Student {
    String name;
    int age;

    public String toString() {
        return this.name + " " + this.age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
        // A obj1 = new A();
        // B obj2 = new B();

        // Runnable obj1 = new Runnable() {
        // public void run() {
        // System.out.println("In run method");
        // }
        // };

        Counter c = new Counter();

        // Lambda expression
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                // System.out.println("in run method using lambda");
                c.increment();
            }
        };
        // Runnable obj2 = new B();

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        // System.out.println(obj1.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);

        Thread t1 = new Thread(obj1);

        Thread t2 = new Thread(obj2);

        // obj1.start();
        // try {
        // Thread.sleep(5);
        // } catch (InterruptedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // obj2.start();

        t1.start();
        t2.start();

        // Thread safe means only one thread can work on that item at one time
        t1.join();
        t2.join();
        System.out.println(c.count);

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(71);
        nums.add(32);
        nums.add(29);

        // System.out.println(nums);
        // Collections.sort(nums);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<String> com1 = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<Student> com2 = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<String> lst = new ArrayList<>();
        lst.add("Kartik");
        lst.add("abc");
        lst.add("ab");
        lst.add("hello");
        lst.add("ajdhajsfgasdf");

        Collections.sort(nums, com);
        Collections.sort(lst, com1);
        // System.out.println(lst);

        // System.out.println(lst);

        List<Student> lst1 = new ArrayList<>();
        lst1.add(new Student("Kartik", 19));
        lst1.add(new Student("Aman", 29));
        lst1.add(new Student("Mohit", 25));
        lst1.add(new Student("Yash", 18));
        System.out.println(lst1);
        Collections.sort(lst1, com2);
        System.out.println(lst1);
    }
}
