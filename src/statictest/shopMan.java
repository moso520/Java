package statictest;

import java.util.Scanner;
public class ShopMan {
    private static float SALE_PRICE;
    public static void main(String[] args){
        BookStore bookStore = new BookStore();
        Scanner input = new Scanner(System.in);
        System.out.println("Please input book price");
        float price = input.nextFloat();
        System.out.println("please input identity");
        int identity = input.nextInt();
        ShopMan.SALE_PRICE = bookStore.bookPrice(price,identity);
        System.out.println("the price for this man is " + SALE_PRICE);
    }
}
