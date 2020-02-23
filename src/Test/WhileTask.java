public class WhileTask {
    public static void main(String[] args) {
    //Task1-->Water Task
        /*
        System.out.println("Task1-->Water Task");
        int i = 120;
        int j = 0;
        while(i > 0 ){

            i = i + 18*j;
            i = i - 30*j;
            j = j + 1;

        }
        System.out.println("Need :" + j);
        */
    //Task2-->star
        /*
        System.out.println("Task2-->star");
        int i = 0;
        while (i < 4){
            int j = 4 - i - 1;
            while (j > 0){
                System.out.print(" ");
                j--;
            }
            int m = 2*i + 1;
            //System.out.print(m);
            while (m > 0){
                System.out.print("*");
                m--;
            }
            i++;
            System.out.println();
        }
        //Task 3 --> run
        System.out.println("Task 3 --> run");
        int i = 1000;
        int j = 0;
        do {
            i = i - 7*j;
            i = i - 18*j;
            j = j + 1;
            System.out.println(i);
        }while (i >= 0);
        System.out.println(j);
        */
        //Task4 --> sale watermelon
        System.out.println("Task4 --> sale watermelon");
        int i = 1020;
        int j = 1;
        do {
            i = i - i/2 - 2;
            j++;
            System.out.println("i :" + i);
        }while (i >= 0);
        System.out.println("j: " + j);
    }
}


