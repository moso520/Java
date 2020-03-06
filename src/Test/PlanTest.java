package Test;
import java.util.Scanner;
public class PlanTest {
    public static void main(String[] args) {
        System.out.println("please input number: ");
        Scanner input = new Scanner(System.in);
        int planNumber = input.nextInt();
        /*switch(planNumber){
            case (1):
                System.out.println("learning chinese!");
                break;
            case (3):
                System.out.println("learning chinese!");
                break;
            case (5):
                System.out.println("learning chinese!");
                break;
            case (2):
                System.out.println("learning math!");
                break;
            case (4):
                System.out.println("learning math!");
                break;
            case (6):
                System.out.println("learning math!");
                break;
            case (7):
                System.out.println("have fun!");
                break;
            default:
                System.out.println("Iput Error: ");
                break;
        }
         */
        if (planNumber>0 & planNumber <=7){
            switch (planNumber%2){
                case (0):
                    System.out.println("learning math!");
                case (1):
                    if (planNumber == 7){
                        System.out.println("Have fun!");
                    }else {
                        System.out.println("learning chinese!");
                    }
            }
        }else {
            System.out.println("Input Error :" + planNumber);
        }
    }
}