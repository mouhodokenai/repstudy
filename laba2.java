import java.util.Scanner;
public class laba2 {
    static int Fact(int a){
        int f = 1;
        for(int i=1; i<=a; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input N: ");
        int N = in.nextInt();
        System.out.println("Input X: ");
        int X = in.nextInt();
        double res = 0;

        for(int i=0; i<=N; i++){
            int b=Fact(i);
            res=res+(Math.pow(-1,i)*Math.pow(X,i))/b;
        }
        //System.out.println(b);
        System.out.println("Result: " + res);
    }
}
