import java.util.Scanner;

class Prime{
public static void main(String[] args){

  Scanner obj = new Scanner(System.in);
  
   int n = obj.nextInt();
   int count = 0;

 if(n<2){
   System.out.println("This is not a prime number");
     }
 
  for(int i=1; i<=n; i++){
     if(n%i==0){
     count++;
       }
    }

if(count==2){
  System.out.println("This is prime number");
    }

else{
  System.out.println("This is not a prime number");
    }

        }
     }