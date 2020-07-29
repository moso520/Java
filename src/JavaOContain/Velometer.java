package JavaOContain;

public class Velometer {
    private int standradTime = 5;
    public Velometer(){};

    public void measure(Car car){
        int carRunTime = 100/car.getCarSpeed();
        if (carRunTime < standradTime){
            System.out.println("start to pirsue the car");
            PoliceSpeed policeSpeed = new PoliceSpeed(30);//为什么必须在这里传入参数？而在ClassTest里面就为0？
            policeSpeed.pirsue(car);
        }else {
            System.out.println("The car is running as formal, good luck!");
        }
    }
}
