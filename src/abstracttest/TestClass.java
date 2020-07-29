package abstracttest;

public class TestClass implements testa,testb {
    //具体类不能直接继承jiekou，要重写方法或者自己变成抽象类
    @Override
    public int testB(int b) {
        return 0;
    }
}
