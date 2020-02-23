import java.util.Scanner;
public class SwitchTask {
    public static void main(String[] args) {
        System.out.println("please input score: ");
        Scanner score = new Scanner(System.in);
        int input = score.nextInt();
        String x;
        if (input < 60) {
            x = "F";
        } else if (input >= 60 & input < 70) {
            x = "JG";
        } else if (input >= 70 & input < 80) {
            x = "ZH";
        } else if (input >= 80 & input < 90) {
            x = "L";
        } else if (input >= 90 & input < 100) {
            x = "YX";
        } else if (input == 100) {
            x = "MF";
        }else{
            x = "Error";
        }
        switch(x){
            case("F"):
                System.out.println("Exam Failed!");
                break;
            case("JG"):
                System.out.println("ji ge!");
                break;
            case("ZH"):
                System.out.println("zhong");
                break;
            case("L"):
                System.out.println("liang");
                break;
            case("YX"):
                System.out.println("youxiu");
                break;
            case("MF"):
                System.out.println("manfen");
                break;
            default:
                System.out.println("Input Error");
        }
    }
}