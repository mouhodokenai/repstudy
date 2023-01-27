import java.util.Scanner;
public class laba3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Таблица умножения от: ");
        int s = in.nextInt();
        System.out.print("Таблица умножения до: ");
        int f = in.nextInt();
        for (int j = s; j<=f; j++) {
            for (int i = s; i<=f; i++) {
                System.out.println("----------------------");
                System.out.println(j+" * "+ i +" = "+ j*i);
            }
        }
    }
}
