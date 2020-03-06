package JavaOO;

import java.util.Scanner;

public class Calculator {

    public float addCalculator(float i, float j) {
        return i + j;
    }

    public float minusCalculator(float i, float j) {
        float minus = i - j;
        return minus;
    }

    public float divideCalculator(float i, float j) {
        float divide = i / j;
        return divide;
    }

    public float multiplyCalculator(float i, float j) {
        float multiply = i * j;
        return multiply;
    }

    public float takeMODCalculator(float i, float j) {
        float MOD = i % j;
        return MOD;
    }

    public void calculate() {
        System.out.println("Please input a number: ");
        Scanner input1 = new Scanner(System.in);
        String number = input1.nextLine();
        float number1 = Float.parseFloat(number);
        while (true) {
            System.out.println("Please input action: ");
            String action = input1.nextLine();
            if (action.equals("=")) {
                break;
            }
            System.out.println("Please input a number: ");
            String number3 = input1.nextLine();

            float number2 = Float.parseFloat(number3);
            switch (action){
                case "+":
                    number1 = this.addCalculator(number1,number2);
                    break;
                case "-":
                    number1 = this.minusCalculator(number1,number2);
                    break;
                case "/":
                    number1 = this.divideCalculator(number1,number2);
                    break;
                case "*":
                    number1 = this.multiplyCalculator(number1,number2);
                    break;
                case "%":
                    number1 = this.takeMODCalculator(number1,number2);
                    break;
                default:
                    System.out.println("action error");
            }
        }
    System.out.println(number1);
    }

}
