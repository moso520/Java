import java.util.Scanner;
public class week {
    public static void main(String[] args) {
        System.out.print("Please input the number:");
                Scanner day = new Scanner(System.in);
                int input = day.nextInt();
                if(input == 1){
                    System.out.print("Monday");
                }else if(input == 2){
                    System.out.print("Tuesday");
                }else if(input == 3){
                    System.out.print("Wednesday");
                }else if(input == 4){
                    System.out.print("Thursday");
                }else if(input == 5) {
                    System.out.print("Friday");
                }else if(input == 6){
                    System.out.print("Saturday");
                }else if(input == 7){
                    System.out.print("Sunday");
                }else {
                    System.out.print("input Error!");
                }
    }
}