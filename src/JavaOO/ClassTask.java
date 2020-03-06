package JavaOO;

public class ClassTask {
    public static void main(String args[]){
        Person p = new Person();
        //p.drawStar(4," ");
        int[] a = {2,5,4,6,8,0,4,8};
        //p.maopao(a,"down");
        int[] m = {1,3,1,4};
        int[] n = {2,5,2,6};
        p.switchArray(m,n);
        int Max = p.searchMax(a);
        System.out.println();
        System.out.println("Max is "+ Max);
    }
}
