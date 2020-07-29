package singleton;

public class SingleTon {
    //饿汉式
    /*private SingleTon(){};
    private static SingleTon singleTon = new SingleTon();
    public static SingleTon getSingleTon(){
            return singleTon;
    }*/
    //懒汉shi
    private SingleTon(){};
    private static SingleTon single_lan;
    public static SingleTon getSingle_lan(){
        if (single_lan == null){
            single_lan = new SingleTon();
        }
        return single_lan;
    }
}
