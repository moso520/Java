package abstracttest;

public abstract class TestInterface implements testa,testb,testc {

   public static void main(String[] args){
       System.out.println(testA);
       System.out.println(testB);

   }

    public int testB(int b) {
        System.out.println(testB);
        return b;
    }

}
