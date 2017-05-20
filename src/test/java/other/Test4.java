package other;

/**
 * Created by wildcard on 18.05.2017.
 */
public class Test4 {

    static int b = 5;
    static int a = 3;

    public static void main(String[] args) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("b: " + b + "a: " + a);
    }
}
