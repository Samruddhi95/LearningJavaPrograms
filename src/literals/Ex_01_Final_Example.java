package literals;

public class Ex_01_Final_Example {
    public static void main(String[] args) {
        int local;
        local=10;
        System.out.println(local);

        final float pi=3.14f;
        // PI = 3.13f; This is final in nature.
        //pi=10 not possible
        System.out.println(pi);
    }
}
