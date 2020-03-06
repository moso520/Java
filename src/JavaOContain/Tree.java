package JavaOContain;

public class Tree {
    public int tall;
    public String color;
    public Apple apple;

    public Tree(){};
    public Tree(int tall,String color,Apple apple){
        this.tall = tall;
        this.color = color;
        this.apple = apple;
    }

    public void growApple(){
        System.out.println("this is a " + tall + "high, " + color + "yanse");
        System.out.println("this is a " + apple.color +"yanse" + apple.number +"shuliang" + apple.style +"de tree");
        apple.eat();
    }
}
