package statictest;

public class BookStore {
    private static final int STORE_ADMIN = 0;
    private static final int STORE_VIP = 1;
    private static final int STORE_NORMAL = 2;
    public float price;
    public float bookPrice(float price, int identity){

        switch (identity){
            case BookStore.STORE_ADMIN:
                this.price = (float) (price * 0.5);
                break;
            case BookStore.STORE_VIP:
                this.price = (float) (price * 0.8);
                break;
            case BookStore.STORE_NORMAL:
                this.price = price;
            default:
                this.price = price * 9999;
                System.out.println("We can not identy the identity");
        }
        return this.price;
    }

}
