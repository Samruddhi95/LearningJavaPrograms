package tasks;

public class Ex_07_Even_Odd_number {
    public static void main(String[] args) {
        //Take user input & Check weather the input is even or odd number
        String number = args[0];
        int num1=Integer.parseInt(number);
        if (num1%2==0) {
            System.out.println("Number is even: " + num1);
        }else{
            System.out.println("Number is odd:" +num1);
        }
    }
}
