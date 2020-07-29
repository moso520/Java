package Test;
import java.util.*;

public class ArrayTask {
    public static int pi(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        return 1;
    }
    public static String p(String s){
        System.out.println("---------------" + s + "---------------");
        return s;
    }
    public static int pin(int i){
        System.out.println(i);
        return 0;
    }
    public <T> void printMsg( T... args){
        for(T t : args){
            System.out.printf("泛型测试","t is " + t);
        }
    }

    public static void main(String[] args) {
    //Task1
        /*
        p("Task1");
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int[] c = new int[4];
        int[] d = new int[4];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i < a.length; i++){
            d[i] = b[i];
        }
        a = d;
        b = c;
        pi(a);
        pi(b);
        //

        //Task 2
        //Task 1 update
        p("Task 1 update");
        int[] a = {1,2,3,4,8,7,0,55};
        for (int i = 0; i <= (a.length - 1)/2; i++){
            int j = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = j;
        }
        pi(a);
        */
        /*
        p("Task 2");
        int[] a = {1,2,3,4,5,6};
        for (int i = 0; i < a.length/2; i++){
            int n = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = n;
        }
        pi(a);

        //Task3
        p("Task3");
        int[] a = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0;i < a.length; i++){
            sum+=a[i];
        }
        int average = sum/a.length;
        pin(average);

        //Task4
        p("Task4");
        int[] a = {1,2,3,4,5,6};
        //int m = a.max();

        //Task 4
        p("Task 5");
        int[] a = {2,6,5,7,4,0,32,55,7};
        Arrays.sort(a);
        pi(a);
        System.out.println("The min is: " + a[0]);
        System.out.println("The max is: " + a[a.length -1]);



        //Task 5
        p("Task 6");
        int[] a = {1,2,3};
        int[] b = {4,5};
        int[] c = new int[a.length + b.length];

        //Task 5 update
        p("Task 5 update");
        int[] a = {1,2,3};
        int[] b = {4,5};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < (a.length + b.length); i++){
            if (i < a.length){
                c[i] = a[i];
            }else {
                c[i] = b[i - a.length];
            }
        }
        pi(c);
        /*
        //Task 6
        int[] a = {1,2,3,9,4,5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        pi(b);
        Arrays.sort(a);
        int max = a[a.length - 1];
        pin(max);
        int index = 0;
        for (int i = 0; i < b.length; i++){
            if (b[i] == max){
                index = i;
            }
        }
        pin(index);
        int[] c = new int[index];
        int[] d = new int[b.length - index - 1];
        //insert to arr c
        for (int i = 0; i < c.length; i++){
            c[i] = b[i];
        }
        //insert to arr d
        for (int i = 0; i < d.length; i++ ){
            d[i] = b[index + 1 + i];
        }
        pi(c);
        pi(d);

        //Task 7
        p("Task 7");
        int[] a = {65,8,3,0,0,4,5,0,6,7,0};
        // j is the sum of 0 in arr a
        int j = 0;
        for (int i : a){
            if (i == 0){
                j++;
            }
        }

        int[] b = new int[a.length - j];
        int x = 0;
        //insert the != 0 number to b
        for(int m = 0; m < a.length; m++){
            if (a[m] != 0){
                b[x] = a[m] ;
                x++;
            }
        }
        for (int l : b){
            System.out.print(l + " ");
        }
        System.out.println();
        for (int f : a){
            System.out.print(f + " ");
        }
        //Task 8
        p("Task 8");
*/
        //count sushu
        int a[] = new int[25];
        //add into arr
        int n = 0;
        for (int i = 2; i < 100; i++) {
            boolean x = false;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    //System.out.println("fei su shu: " + i);
                    x = true;
                    break;
                }
            }
            if (x == false) {
                //System.out.println("su shu: " + i);
                a[n] = i;
                n++;
            }
        }
        pi(a);
    }
}