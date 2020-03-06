package JavaOO;

public class ArrayBox<E> {
    public int size;
    public int[] array;

    public int size(Object[] arry){
        int j = 0;
        for (Object m:arry){
            j++;
        }
        return j;
    }

    public Object get(Object[] arry,int index){
        return arry[index];

    }

    public Object[] add(Object[] arry, int loc, int ins){
        int m = (int) this.size(arry);
        Object[] newArray = new Object[m + 1];
        for (int i = 1; i < loc; i++){
            newArray[i - 1] = arry[i - 1];
        }
        newArray[loc - 1] = ins;
        for (int i = loc; i <= m; i++){
            newArray[i] = arry[i - 1];
        }
        return newArray;
    }

    public Object[] remove(Object[] arry, int loc){
        int m = this.size(arry);
        Object[] newArray = new Object[m - 1];
        for (int i = 1; i< loc; i++){
            newArray[i - 1] = arry[i - 1];
        }
        for (int i = loc; i < m; i++){
            newArray[i - 1] = arry[i];
        }
        return newArray;
    }

}
