import java.util.Scanner;

class Sec_small{
public static void main(String[] args){

   Scanner obj = new Scanner(System.in);

   System.out.println("Enter the size of the Array :");
   int n = obj.nextInt();
   int arr[] = new int[n];

   System.out.println("Enter the elements :");
  for(int i=0; i<n; i++){
   arr[i] = obj.nextInt();
      }

   int small = arr[0];

  for(int i=1; i<n; i++){
   if(arr[i] < small){
      small = arr[i];
       }
      }

   int sec_small = arr[0];

  for(int i=0; i<n; i++){
   if(arr[i] != small && arr[i] < sec_small){
      sec_small = arr[i];
       }
      }
   
   System.out.println("The Second Smallest Element in the Array is : " + sec_small);

}}