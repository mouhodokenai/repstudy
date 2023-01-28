import java.util.Scanner;
import java.lang.Math;
public class dop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("вводим действие +, *,  ^: ");
        String act = in.next();
        System.out.println("вводим а: ");
        int a = in.nextInt();
        System.out.println("вводим b: ");
        int b = in.nextInt();
        System.out.println("вводим модуль с: ");
        int c1 = in.nextInt();
        int c = Math.abs(c1);
        if (act == "+") {
            System.out.printf("a+ b = %d: %d (mod %d)", a+b, ((a + b) % c), c);
        }
        else if (act == "*") {
            System.out.printf("a * b = %d: %d (mod %d)", a*b, ((a * b) % c), c);
        }
        else {
            System.out.printf("a^b = %f: %f (mod %d)", Math.pow(a, b), (Math.pow(a, b) % c), c);

        }
    }

    }

