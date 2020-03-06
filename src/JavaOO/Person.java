package JavaOO;
import java.util.*;
public class Person {
    public String sex;
    //Task 0
    public void drawStar(int line, String dir){
        System.out.println("--------->Task 1");
        for (int i = 0; i < line; i++){
            if (dir == "left"){
                for (int m = 0; m < i; m++){
                    System.out.print(" ");
                }
            }
            for (int j = line - i; j > 0; j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    //Task 1
    public void switchArray(int[] a,int[] b){
        for (int i = 0; i < a.length; i++){
            int x = a[i];
            a[i] = b[i];
            b[i] = x;
        }
        System.out.print("first: ");
        for (int v : a){
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.print("second: ");
        for (int v : b){
            System.out.print(v + " ");
        }
    }
    //Task 9
    public void maopao(int[] arr1, String xulie){
        System.out.println("--------->Task 9");
        for (int i = 0; i < arr1.length - 1; i++){
            for (int j = i + 1; j < arr1.length; j++){
                if (xulie == "up"){
                    if (arr1[i] < arr1[j] ){
                        int m = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = m;
                    }
                }else {
                    if (arr1[i] > arr1[j] ){
                        int m = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = m;
                    }
                }

            }
        }
        for (int v : arr1){
            System.out.print(v+" ");
        }
    }
//Task 3-->Search max number
    public int searchMax(int[] arr){
        int[] a = {2,6,5,7,4,0,32,55,7};
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length -1];
        return max;

    }


    public String name;
    public int age;
    public Person(String n, int a){
        this();
        this.name = n;
        this.age = a;
        System.out.println(name + "今年" + age + "岁");
    }
    public Person(){
        System.out.println("我是构造方法的重载！");
    }
    {
        System.out.println("我是程序块！");
    }
    {
        System.out.println("我又是程序块！");
    }

    //this

}
