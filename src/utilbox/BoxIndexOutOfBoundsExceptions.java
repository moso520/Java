package utilbox;

public class BoxIndexOutOfBoundsExceptions extends RuntimeException{
    public BoxIndexOutOfBoundsExceptions(){};
    public BoxIndexOutOfBoundsExceptions(String msg){
        super(msg);
    }
}
