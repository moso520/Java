package class_load;

public class Person extends Animal{
    public String sx = "Person类的属性";
    public static String sxs = "Person类的静态属性";

    public Person(){
        System.out.println();
        System.out.println("11我是Person类的无参数构造方法");
    }

    public static void fun(){
        System.out.println();
        System.out.println("12我是Person无参数静态方法");
    }

    public void testfun(){
        System.out.println();
        System.out.println("13我是Person类中的无参数普通方法");
    }

    {
        System.out.println();
        this.testfun();
        System.out.println("14我是Person调用了类的属性++" +sx);
    }

    static {
        System.out.println();

        Person.fun();
        System.out.println("15我是Person调用了类的属性++" + sxs);
    }

}
