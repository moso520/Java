package modifier;

public class packA {
    public static void main(String[] args){
        System.out.println("This is main function");
        packA tA = new packA();
        tA.funPublic();
        tA.funDefault();
        tA.funProtected();
        tA.funPrivate();

    }

    public void funPublic(){
        System.out.println("This is public function");
    }

    protected void funProtected(){
        System.out.println("This is Protected function");
    }
    void funDefault(){
        System.out.println("This is Default function");
    }
    private void funPrivate(){
        System.out.println("This is Private function");
    }



}
