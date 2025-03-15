package tasks;

public class Ex_04_In_De_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        /* line no , a , expression
        5 , 10, NA
        6, 13, 11+11+12
        Output is :- a=13 and expression value=34
         */


    }
}
