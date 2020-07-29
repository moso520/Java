package testutil;

import util.*;

public class TestMain {
    public static void main(String[] args){
        /*ArrayBox ab = new ArrayBox();
        ab.add(10);
        ab.remove(0);
        ab.get(0);
        ab.size();*/

        LinkedBox lb = new LinkedBox();
        lb.add(10);
        lb.add(11);
        lb.remove(0);
        int a = lb.get(0);
        int b = lb.size();
        System.out.println(a);
        System.out.println(b);
    }
}
