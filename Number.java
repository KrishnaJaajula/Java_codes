   import java.util.Scanner;

         class Number{
             
         public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
             
             int m = obj.nextInt();
           
            if(m<0){
              System.out.println("The number is negative");
                    }

            else if(m>0){
              System.out.println("The number is positive");
                         }
            else{
              System.out.println("ZERO");
                 }
            }
        }	  