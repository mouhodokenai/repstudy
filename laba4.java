import java.util.Scanner;
public class laba4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("вводим длину: ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("вводим элементы:");

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        System.out.println("Среднее арифметическое: " + Sred(array));
        System.out.println("Минимальный элемент: " + Minelem(array));

    }

    public static double Sred(int[] array)
    {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum / array.length;
    }

    public static int Minelem(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

}
