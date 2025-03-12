package tasks;

public class EX_02_Calculate_Cube_Root {
    public static void main(String[] args) {
        double x= 10;
        double y= 10;
        double z= 10;
        //calculates the cube root of (x² + y² + |z|)

      double x_square= Math.pow(x,2);
      double y_square= Math.pow(y,2);
      double abs_z= Math.abs(z);

      double result = Math.cbrt(x_square+y_square-abs_z);

        System.out.println("Square of " + x + " is: " + x_square);
        System.out.println("Square of " + y + " is: " + y_square);
        System.out.println("Expected result is : " + result);


    }
}
