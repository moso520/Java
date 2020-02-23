public class TestArray {
    public static void main(String[] args) {
        //test update value
        /*
        int[] x = {10,20,30};
        int[] y = x;
        y[0] = 1000;
        System.out.println(x[0]);
        */
        //insert even number
        int[] evenNumber = new int[51];
        int j = 0;
        for (int x = 0; x <= 100; x++){
            if (x%2 == 0){
                evenNumber[j] = x;
                //System.out.println(evenNumber[j]+":"+j);
                j++;

            }else {
                continue;
            }
        }
        for (int m = 0; m < evenNumber.length; m++){
            System.out.println(evenNumber[m]);
        }
    }
}