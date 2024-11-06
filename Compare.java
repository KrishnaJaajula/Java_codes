import java.util.Scanner;

class Compare{

public static void main(String[] args){

       Scanner obj = new Scanner(System.in);

       double a = obj.nextDouble();
       double b = obj.nextDouble();

   if(a==b){
     System.out.println("equal inputs");
          }
 
   else if(a>b){
      System.out.println("\'a\' is greater than \'b\'");
                }

   else{
      System.out.println("\'b\' is greater than \'a\'");
       }
         }
           }