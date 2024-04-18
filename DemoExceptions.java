//Exceptions

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class DemoExceptions {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                // throw new ArithmeticException("i dont want to know output");
                throw new MyException("this is custom exception");
            }
        } catch (MyException e) {
            System.out.println("this is a custom exception of type MyException " + e);
        } catch (ArithmeticException e) {
            // System.out.println("cannot divide by zero");
            j = 18 / 1;
            System.out.println("default output " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
