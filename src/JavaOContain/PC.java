package JavaOContain;

public class PC {
    public int number;
    public String tradeMark;
    public String status;

    public PC(){};
    public PC(int number,String tradeMark,String status){
        this.number = number;
        this.tradeMark = tradeMark;
        this.status = status;
    }
    public void openPC(){
        System.out.println("The PC is turn on!");
    }
}
