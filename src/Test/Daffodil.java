package Test;

public class Daffodil {
    public static void main(String[] args) {
        for(int i = 101; i<1000; i++){
            int i1 = i/100;
            int i2 = (i - i1 * 100)/10;
            int i3 = i - i1*100 - i2*10;
            //int i1 = i/100;
            //int i2 = i/10%10;
            //int i3 = i%10;
            if(Math.pow(i1,3) + Math.pow(i2,3) + Math.pow(i3,3) == i){
                System.out.println("Shui xian hua shi: " + i);
            }
        }

    }
}