import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String []args){

        // when we are allowed to use two array
       Scanner sc = new Scanner(System.in);
        System.out.println("Insert n");
       int n =sc.nextInt();

       System.out.println("Insert array");
       int []arr= new int[n];

       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }
       
       int []newArray = new int[n];
       
       int j=newArray.length-1;

       while(j>=0){
        newArray[j]= arr[n-j-1];
        j--;
       }
    for(int val:newArray){
        System.out.println("newArray:");
        System.out.println(val);
    }
    }
    public static void ReverseArray(String[] args) {

        //when we swap element does not include one more array
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert n");
       int n =sc.nextInt();

       System.out.println("Insert array");
       int []arr= new int[n];

       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }
       
       int []newArray = new int[n];
       int i=0;
       int j=newArray.length-1;

       while(i>j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
    for(int val:newArray){
        System.out.println("newArray:");
        System.out.println(val);
    }
    }
   
}

// https://www.drumbuffer.com/  