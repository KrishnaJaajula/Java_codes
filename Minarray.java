import java.util.Scanner;

class Minarray{
public static void main(String[] args){

Scanner obj = new Scanner(System.in);
     
   System.out.println("Enter the size of the array:");
   int n = obj.nextInt();

     int arr[] = new int[n];
    
  if(n<=0){
    System.out.println("invalid size of array");
      }

    System.out.println("Enter the elements");
  for(int i=0; i<n; i++){
      arr[i] = obj.nextInt();
      }
  
    int min = arr[0];
     
  for(int i=0; i<n; i++){
     if(min>arr[i]){
     min = arr[i];
        }
      }

   System.out.println("Min element in the array is :" +" "+ min);
         
     obj.close();

      }
   }