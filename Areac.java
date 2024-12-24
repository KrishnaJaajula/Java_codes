import java.util.Scanner;

class Areac{
public static void main(String[] args){

   Scanner obj = new Scanner(System.in);
   
   System.out.println("Enter the \"Radius\" of the circle : ");
   Double radius = obj.nextDouble();

   Double area = Math.PI * (radius*radius);
   System.out.println("The Area Of The Circle is :" + area );
 
   obj.close();

    }

  }