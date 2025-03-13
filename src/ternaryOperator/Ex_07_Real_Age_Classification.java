package ternaryOperator;

public class Ex_07_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user
        String age1 = args[0];
        System.out.println(age1);
        int age = Integer.parseInt(age1);
        String result= (age<18) ? "minor":(age>=18 && age<65)? "Adult":"Sinor";
        System.out.println(result);

    }
}
