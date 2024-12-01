import java.util.Scanner;

class Power{
public static void main(String[] args){
 
     Scanner obj = new Scanner(System.in);

     int temp = 1;
     double num = obj.nextDouble();
     double expo = obj.nextDouble();

  for(int i=0; i<expo; i++){
     temp *= num;
   System.out.println(temp);

        }

              }
          }