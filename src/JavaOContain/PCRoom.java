package JavaOContain;

public class PCRoom {
    public int length;
    public String location;
    public PC pc;

    public PCRoom(){};
    public PCRoom(int length,String location,PC pc){
        this.length = length;
        this.location = location;
        this.pc = pc;
    }
    public void roomStatus(){
        System.out.println("A PCroom is "+ length + " long, and in " + location + " city!");
        System.out.println(pc.number + " pc with " + pc.tradeMark + " is " + pc.status + " status. A student going to " + location + " PC room that with " + length);
        pc.openPC();
    }

}
