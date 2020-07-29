package class_load;

public class Animal {
    public String sx = "animal类的属性";
    public static String sxs = "animal类的静态属性";

    public Animal(){
        System.out.println();
        System.out.println("1我是animal类的无参数构造方法");
    }

    public static void fun(){
        System.out.println();
        System.out.println("2我是animal无参数静态方法");
    }

    public void testfun(){
        System.out.println();
        System.out.println("3我是animal类中的无参数普通方法");
    }

    {
        System.out.println();
        this.testfun();
        System.out.println("4我是animal调用了类的属性++" +sx);
    }

    static {
        System.out.println();
        Animal.fun();
        System.out.println("5我是animal调用了类的属性++" +sxs);
    }

}
