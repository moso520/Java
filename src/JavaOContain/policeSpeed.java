package JavaOContain;

public class PoliceSpeed {
    private int pcSpeed;
    public PoliceSpeed(){};
    public PoliceSpeed(int pcSpeed){
        this.pcSpeed = pcSpeed;
    }
    public void pirsue(Car car){
        int carspeed = car.getCarSpeed();
        System.out.println(carspeed);
        System.out.println(this.pcSpeed);
        if (carspeed < this.pcSpeed){
            int pirsueTime = 100/(pcSpeed - carspeed);
            System.out.println("the police catch the car used : " + pirsueTime + " Seconds.");
        }else {
            System.out.println("The car is run too fast");
        }
    }

}
