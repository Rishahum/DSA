import java.util.Scanner;

public class SubArray {
    public static void main(String []arg){
        Scanner sc= new Scanner(System.in);
          System.out.println("Enter index of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Insert array:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Subarrays: ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
