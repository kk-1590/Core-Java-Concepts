import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo6 {
    public static void main(String[] args) {
        // try {
        // int num = System.in.read();
        // System.out.println(num - 48);
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // InputStreamReader reader = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(reader);

        // try {
        // int num = Integer.parseInt(br.readLine());
        // System.out.println(num);
        // br.close();
        // } catch (Exception e) {
        // // TODO: handle exception
        // }

        // try with resources
        int i = 2;
        int j = 0;
        InputStreamReader reader = new InputStreamReader(System.in);
        try (BufferedReader br = new BufferedReader(reader)) {
            j = 18 / i;
            System.out.println("Bye");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("in finally block");
        }
    }
}
