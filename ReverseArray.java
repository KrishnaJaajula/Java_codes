import java.util.Scanner;

class ReverseArray{
public static void main(String args[]){

     Scanner obj = new Scanner(System.in);
     
     System.out.println("Enter the size of array");
     int n = obj.nextInt();
    
     int arr[] = new int[n];

     System.out.println("Enter the elements");
   for(int i=0; i<n; i++){
      arr[i] = obj.nextInt();
      }

     System.out.println("Reverse order of the array");
   for(int i=n-1; i>=0; i--){
      System.out.println(arr[i]);
      }
   
           }
        }