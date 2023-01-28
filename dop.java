import java.util.Scanner;
public class dop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("вводим число: ");
        int n = in.nextInt();
        in.close();

        int kol = 0;

        while (n != 1) {
            if (n%2==0){
                kol++;
                n = n / 2;
                System.out.println(n);

            }
            else {
                n = n * 3 + 1;
                System.out.println(n);
            }

        }
        System.out.println("Количество итераций:" + kol);



    }

}


