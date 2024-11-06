import java.util.Scanner;

class Rangesum{

public static void main(String[] args){

       Scanner obj = new Scanner(System.in);
 
       int a = obj.nextInt();
       int b = obj.nextInt();

       int c = 0;

   for(int i=a; i<=b; i++){
      
       c += i;
       System.out.println("The Sum Is : " + c);
                }
        }
     }