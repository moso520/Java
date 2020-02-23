import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        System.out.print("Please input the month munber:");
        Scanner month = new Scanner(System.in);
        int input = month.nextInt();
        if (input >= 3 & input <= 5) {
            System.out.print("Spring");
        }else if(input >= 6 & input <= 8){
            System.out.print("Summer");
        }else if(input >= 9 & input <= 11){
            System.out.print("Autumn");
        }else if(input==12|input == 1|input==2){
            System.out.print("Winter");
        }else {
            System.out.print("Error");
        }
    }
}

