package JavaOContain;

public class ClassTest {
    public static void main(String[] args){
//        Tree tree = new Tree(50, "Green",new Apple(5,"circle","red"));
//        tree.growApple();
        Car car = new Car(21);
        PoliceSpeed pc = new PoliceSpeed();
        Velometer vm = new Velometer();
        vm.measure(car);
    }
}
