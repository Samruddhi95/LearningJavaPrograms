package tasks;

public class Ex_06_In_De_Operator {
        public static void main(String[] args) {
            int a = 20;
            System.out.println(--a + a++ + a--);
            /*
            line no  a  exp(--a) exp(a++) exp(a--)
               5     20
               6     20  19  19  20
            Output:19+19+20=58
             */
        }
    }

