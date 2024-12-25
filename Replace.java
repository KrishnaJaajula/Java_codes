import java.util.Scanner;

class Replace{
public static void main(String[] args){

 Scanner obj = new Scanner(System.in);

    
    System.out.println("Enter the numeber :");
  
    String S = obj.nextLine();

    String S1 = " ";

  for(int i=0; i<S.length(); i++){

    if(S.charAt(i) == '0'){
       S1 = S1 + '1';
         }
    else{
       S1 = S1 + S.charAt(i);
         }  
       }
    
 System.out.println("After replace : ");
 System.out.println(S1);
        obj.close();

        }
      }
    