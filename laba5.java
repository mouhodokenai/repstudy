import java.util.Arrays;
import java.util.Scanner;
public class laba5 {
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
        bubbleSort(array);
        System.out.println("отсортированный массив:");
        System.out.println(Arrays.toString(array)); 
    }    

    public static void  bubbleSort(int[] array) {
        for(int i =0; i <array.length -1;  i++) {
            for (int j = 0; j < array.length-i-1; j++) { //
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }    
}

