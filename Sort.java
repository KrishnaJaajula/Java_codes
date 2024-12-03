import java.util.Scanner;

class Sort{
public static void main(String args[]){

     Scanner obj = new Scanner(System.in);
     System.out.println("Enter the size of the array");
        int n = obj.nextInt();

        int arr[] = new int[n];
        int temp = 0;

    System.out.println("Enter the array elements"); 
 
    for(int i=0; i<n; i++){
       arr[i] = obj.nextInt();
        }

   System.out.println("Sorted array elements");

   for(int i=0; i<n; i++){
   for(int j=i+1; j<n; j++){
      if(arr[i] > arr[j]){

       temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
        }
       }
      }

    for(int i=0; i<n; i++){
       System.out.println(arr[i]);
       }
          }
         }