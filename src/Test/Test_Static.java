package Test;

public class Test_Static {
    public String name;
    public static int age;
    public static void main(String[] args){
        Test_Static ts1 = new Test_Static();
        ts1.name = "wang";
        ts1.age = 16;
        System.out.println(ts1.name + "今年" + ts1.age +"岁");
        Test_Static ts2 = new Test_Static();
        ts2.name = "liu";
        ts2.age = 17;
        //非静态不能调用静态，静态能调用静态，静态不能调用非静态
        //System.out.println(Test_Static.name + "今年" + Test_Static.age +"岁");
        System.out.println(ts2.name + "今年" + ts2.age +"岁");
    }
    public void testAge(){
        System.out.println("I am " + this.age + "years old");
    }



}
