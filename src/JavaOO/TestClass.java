package JavaOO;
import java.util.Scanner;
public class TestClass {
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
    public static void main(String args[]) {
//        Person p = new Person();
//
//        p.name = "王Moso";
//        p.age = 18;
//        p.sex = "男";
        //Person p1 = new Person();
//        Person p1 = p;
//        p1.name = "XX";
//        p1.age = 16;
//        p1.sex = "女";
//        System.out.println("我是"+p.name+", 我今年"+p.age+"岁，我的性别是"+p.sex);
//        System.out.println("我是"+p1.name+", 我今年"+p1.age+"岁，我的性别是"+p1.sex);
        Calculator calculator = new Calculator();
//    System.out.println("Please input a number: ");
//    Scanner input1 = new Scanner(System.in);
//    String number = input1.nextLine();
//    System.out.println("Please input action: ");
//    String action = input1.nextLine();
//    System.out.println("Please input a number: ");
//    String number3 = input1.nextLine();
//    int number1 = Integer.parseInt(number);
//    int number2 = Integer.parseInt(number3);
//
//    if(action.equals("+")) {
//        number1 = calculator.addCalculator(number1, number2);
//    }else if(action.equals("-")) {
//        number1 = calculator.minusCalculator(number1, number2);
//    }else if (action.equals("/")) {
//        number1 = calculator.divideCalculator(number1, number2);
//    }else if (action.equals("*")) {
//        number1 = calculator.multiplyCalculator(number1, number2);
//    }else if(action.equals("%")) {
//        number1 = calculator.takeMODCalculator(number1, number2);
//    }else {
//        System.out.println("input action error");
//    }
//    System.out.println("The calculate result is : " + number1);
//
//    }
//    public static void p(String a){
//        System.out.println(a);
//
//    }
        //calculator.calculate();

       // ArrayBox a = new ArrayBox();
        Object[] b = {1,4,5,8,7,0,6};
//        int size = a.size(b);
//        pin(size);
//        a.get(b,1);
//        Object[] n = a.add(b,3,333);
//        Object[] m = a.remove(b,6);
        ArrayNewBox box = new ArrayNewBox();
        Object m = box.get(b,3);
        System.out.println(m);

    }
}

