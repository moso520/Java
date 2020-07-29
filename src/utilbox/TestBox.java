package utilbox;

public class TestBox {
    public static void main(String[] args){
        LinkBox linkBox = new LinkBox();
        linkBox.size();
        linkBox.add(10);
        linkBox.add(20);
        linkBox.get(1);
        linkBox.remove(1);
        linkBox.size();
    }
}
