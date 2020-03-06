package Test;
import java.util.*;
public class maopao {
    public static int pi(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        return 1;
    }

    public static String p(String s) {
        System.out.println("---------------" + s + "---------------");
        return s;
    }

    public static int pin(int i) {
        System.out.println(i);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {55,4,6,2,88,0,1,4,7};
        for (int i = 0; i < arr1.length - 1; i++){
            for (int j = i + 1; j < arr1.length; j++){
                if (arr1[i] < arr1[j] ){
                    int m = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = m;
                }
            }
        }
        pi(arr1);
    }
}