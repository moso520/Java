package JavaOO;

public class ArrayOutOfRange extends RuntimeException{
    public ArrayOutOfRange(){};
    public ArrayOutOfRange(String s){
        System.out.println(s);
    }
}
