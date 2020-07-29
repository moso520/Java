package utilbox;

public class LinkBox implements Box{
    private Node first;
    private Node last;
    private int size;

    //------------------------------------
    //添加
    private void linkLast(int element){
        Node l = last;
        Node newNode = new Node(l,element,null);
        last = newNode;

        if (first == null){
            first = newNode;
        }else {
            l.next = newNode;
        }
        size++;
    }

    //检查index
    private void checkIndex(int index){
        if (index < 0 || index > size - 1){
            throw new BoxIndexOutOfBoundsExceptions("index: " + index + ", size: " + size);
        }
    }
    //获取元素
    private Node getNode(int index){
        Node targetNode;
        if (index <= (size/2)){
            targetNode = first;
            for (int i = 0; i <= (size/2); i++){
                targetNode = targetNode.next;
            }
        }else {
            targetNode = last;
            for (int i = size - 1; i > (size/2); i--){
                targetNode = targetNode.prev;
            }
        }
        return targetNode;
    }

    //移除元素
    private int unlink(Node unlinkNode){
        int oldValue = unlinkNode.item;
        Node prevNode = unlinkNode.prev;
        Node nextNode = unlinkNode.next;

        if (prevNode.prev == null){//
            first = nextNode;
        }else if (nextNode.next == null){
            last = prevNode;
        }else {
            prevNode.next = unlinkNode.next;
            unlinkNode.prev = null;
            unlinkNode.next = null;
        }
        size--;
        return oldValue;
    }

    //-------------------------------------
    @Override
    public boolean add(int element) {
        //要添加，创建了linkLast
        this.linkLast(element);
        return true;
    }

    @Override
    public int get(int index) {

        this.checkIndex(index);
        Node targetNode = this.getNode(index);
        return targetNode.item;
    }

    @Override
    public int remove(int index) {

        //要删除，先判断index是否合法，创建checkIndex
        this.checkIndex(index);
        //获取元素
        Node targetNode = this.getNode(index);
        //移除元素
        this.unlink(targetNode);
        return 0;
    }

    @Override
    public int size() {

        return size;
    }
}
