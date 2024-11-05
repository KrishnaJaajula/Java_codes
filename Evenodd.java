import java.util.Scanner;

class Evenodd{

public static void main(String[] args){

    Scanner obj = new Scanner(System.in);
     double a = obj.nextInt();
    

 if(a%2 == 0){
    System.out.println("EVEN");
            }

 else if(a%2 == 1){
    System.out.println("ODD");
         }

 else{
    System.out.println("INVALID");
          }
   }
}