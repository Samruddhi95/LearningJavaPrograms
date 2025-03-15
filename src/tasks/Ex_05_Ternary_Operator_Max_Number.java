package tasks;

public class Ex_05_Ternary_Operator_Max_Number {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments
        // and calculate the maximum in between with ternary operator.
        String number1 = args[0];
        String number2= args[1];
        int num1=Integer.parseInt(number1);
        int num2=Integer.parseInt(number2);
        String max_number = num1>num2?"num1 is maximum":
                            (num1==num2)?"num 1 and num 2 are same":"num2 is maximum";
        System.out.println(max_number);

    }
}
