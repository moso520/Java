package JavaOO;

public class ArrayNewBox<E> {

    private int size(Object[] arry){
        int objectSize = arry.length;
        return objectSize;
    }

    private void ensureArrayRange(Object[] array, int index){
        if (index < 0 || this.size(array) - 1 < index){
            throw new ArrayOutOfRange("This array size is: " + this.size(array) + ", the index is : " + index + "!");
        }
    }

    public E get(Object[] array , int index){
        this.ensureArrayRange(array,index);
        return (E) array[index];
    }
}
