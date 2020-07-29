package pockageTest;

public class TestPerson {

    public static void main(String[] args){
        Person ps = new Person();
        ps.name = "Li";
        ps.sex = "girl";
        int age = ps.setAge(50);
        System.out.println(age);
    }
}
