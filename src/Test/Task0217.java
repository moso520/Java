public class Task0217 {
    public static void main(String[] args) {
        //Task1

        System.out.println("Task1:");
        for(int i = 0; i < 4; i++){
            for (int m = 4 - i; m > 0; m--){
                System.out.print("*");
            }
            for(int n = 0; n < i; n++){
                System.out.print("#");
            }
            for (int x = 0; x < i - 1; x++){
                System.out.print("#");
            }
            for (int y = 4 - i - 1; y >= 0; y--){
                if (y == 3){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

        //Task4
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++=");
        System.out.println("Task4:");
        for (int i = 2; i < 20; i++) {
            boolean x = false;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    System.out.println("fei su shu: " + i);
                    x = true;
                    break;
                }
            }
            if (x == false) {
                System.out.println("su shu: " + i);
            }
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++=");
        System.out.println("Task2:");
        for (int i = 1; i < 5; i++){
            for (int m = 4 - i; m > 0 ; m--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int n = i - 1; n > 0; n-- ){
                System.out.print(n);
            }
        System.out.println();
        }

    }
}

