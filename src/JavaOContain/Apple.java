package JavaOContain;

public class Apple {
    public int number;
    public String style;
    public String color;

    public Apple(){};
    public Apple(int number,String style, String color){
        this.color = color;
        this.number = number;
        this.style = style;

    }
    public void eat(){
        System.out.println("This is a apple tree");

    }
}
