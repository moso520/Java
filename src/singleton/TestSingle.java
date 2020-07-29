package singleton;

public class TestSingle {
    public static void main(String[] args){
        SingleTon s1 = SingleTon.getSingle_lan();
        SingleTon s2 = SingleTon.getSingle_lan();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
    }
}
