import java.util.Arrays;
import java.util.Scanner;
public class Comb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("вводим длину: ");
        int len = in.nextInt();
        int[] array = new int[len];
        System.out.println("вводим элементы:");
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        combSort(array);
        System.out.println("отсортированный массив:");
        System.out.println(Arrays.toString(array));
    } 

    public static void combSort(int[] array) {
        double factor = 1.247;
        int step = array.length-1;
        while (step >=1) {
            for (int i=0; i+step<array.length; ++i){
                if (array[i]>array[i+step]){
                    swap(array, i, i+step);
                }
            }
            step /= factor;
                }
            }
    
    

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

