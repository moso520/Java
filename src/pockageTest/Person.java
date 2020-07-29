package pockageTest;

public class Person {
    public String name;
    private int age;
    public String sex;

    public int setAge(int age){
        if (age > 0 & age < 100){
            this.age = age;
        }else {
            System.out.println("Input age Error!");
            this.age = -1000000;
        }
        return this.age;

    }
}
