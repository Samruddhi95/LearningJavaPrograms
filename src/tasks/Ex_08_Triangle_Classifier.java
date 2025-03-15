package tasks;

public class Ex_08_Triangle_Classifier {
    public static void main(String[] args) {
        /*Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal), or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.
         */
        String length_value1 = args[0];
        String length_Value2=args[1];
        String length_Value3=args[2];
         int side1= Integer.parseInt(length_value1);
         int side2=Integer.parseInt(length_Value2);
         int side3=Integer.parseInt(length_Value3);

         if (side1==side2 && side2==side3){
             System.out.println("The triangle is equilateral :" +side1 +side2 +side3);
         } else if (side1 == side2 || side1 == side3 || side2 == side3) {
             System.out.println("The angle is isosceles :" +side1 +2 +side3);
         }else {
             System.out.println("The angle is scalene :"+side1 +side2 +side3);
         }

    }
}
