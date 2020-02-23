public class MathExercise {
    public static void main(String[] args) {
        for (int i = 101; i < 200; i++) {
            if (i % 3 == 1 && i % 4 == 2 && i % 5 == 2) {
                System.out.println(i);
            }
        }
    }
}