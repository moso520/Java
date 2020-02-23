public class DoubleArray{
    public static void main(String[] args){
        /*
        //static inital method
        int[][] DA = {{1,5,32,9},{0,1},{33,58,7}};
        for (int i = 0; i < DA.length; i++){
            for (int j = 0; j < DA[i].length; j++) {
                int v = DA[i][j];
                System.out.print(v + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int[] arr : DA){
            for (int value : arr){
                System.out.print(value + "\t");
            }
            System.out.println();
        }

         */
        int[][] DA = new int[3][2];
        //DA --> {{x,x},{x,x},{x,x}};
        //example for ~7;
        System.out.println(~7);//result is -8
        //positive number's source code,inverse code,cpmplement code
        //source code: 00000000 00000111
        //positive number get the negative code,which should get a initial code
        //initial cod: 11111111 11111000
        //initial cod - 1 = qufan
        //           : 01111111 11110111
        //get negative again
        //           :10000000 00001000
        // 10 bit = -8
        System.out.println(~-6);//result is 5
        //        //source code: 10000000 00000110
        //        //inverse code:11111111 11111001
        //        //cpmplement is inverse code + 1
        //        //cpmplement  :11111111 11111010
        //        //qufan = the qufan of cpmplement
        //        //qufa        :00000000 000000101 = 5
        // ~-8
        // 10000000 00001000
        // 11111111 11110111
        // 11111111 11111000
        // 00000000 00000111 = 7

    }
}
