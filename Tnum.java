import java.util.Scanner;

class Tnum{

public static void main(String[] args){

      Scanner obj = new Scanner(System.in);
      int num1 = obj.nextInt();
      int num2 = obj.nextInt();
      int num3 = obj.nextInt();

      int temp , result ; 

  temp = num1>num2 ? num1:num2;
  result = temp>num3 ? temp:num3;

System.out.println(result + "is the greatest");

         }
  }