package reopen;

public class ReOpen {
    private final float FLOAT_FIRST = 1.3F;
    private final long LONG_FIRST = 1L;
    public static void main(String args[]){
        String test = "123";
        switch(test){
            case "a":
                System.out.println("test is" + test);
                break;
            case "1231":
                System.out.println("test is" + test);
                break;
            default:
                System.out.println("testdefault is" + test);
        }

        int testA = 11;
        int number = 0;
        while (testA > 0){
            System.out.println(testA);
            testA--;
            number++;
        }
        System.out.println(number);
        do {
            System.out.println(testA);
            testA++;
        }while (testA < 11);
    }

}
