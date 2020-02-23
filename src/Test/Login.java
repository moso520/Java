import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        //Login Task for DoubleArray
        int[][] src = {{1,3},{2,4},{3,6},{4,8}};
        System.out.println("please input username: ");
        Scanner inputuser = new Scanner(System.in);
        int user = inputuser.nextInt();
        boolean loginsu = false;
        boolean errorout = false;
        int timeuser = 3;
        int timepass = 3;
        do{
            for (int i = 0; i < src.length; i++){
                if (user == src[i][0]){
                    int pass = 0;
                    do {
                        Scanner inputpass = new Scanner(System.in);
                        pass = inputpass.nextInt();
                        timepass--;
                    }while (pass == src[i][1] || timepass < 1);

                    System.out.println("Login Sucessfully");
                    break;

                }else {
                    timeuser--;
                    System.out.println("Try again username, have: " + (timeuser - 1) + "times!");
                    inputuser = new Scanner(System.in);
                    user = inputuser.nextInt();
                }

            }
        }while (timeuser < 1 || timepass < 1 );

    }
}