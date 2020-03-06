package Test;

import java.util.Scanner;
public class scope {
    public static void main(String[] args) {
        System.out.print("Please input the score munber:");
        Scanner score = new Scanner(System.in);
        int input = score.nextInt();
        if (input < 60) {
            System.out.print("Failed");
        } else if (input >= 60 & input < 70) {
            System.out.print("Middle");
        } else if (input >= 70 & input < 100) {
            System.out.print("good");
        } else if (input == 100) {
            System.out.print("Perfect");
        } else {
            System.out.print("Error");
        }
    }
}