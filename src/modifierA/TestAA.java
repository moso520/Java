package modifierA;

import modifier.packA;

public class TestAA extends packA {
    public void testB(){
        this.funPublic();
        this.funProtected();
    }
    public void testC(){
        packA tAA = new packA();
        tAA.funPublic();
        //tAA.funProtected();
        //this.funDefault();
        //tA.funPrivate();
    }

}

