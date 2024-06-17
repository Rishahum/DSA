import java.util.Scanner;

public class MergeArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        // Input for first array
        System.out.println("n1: ");
        int n1 = sc.nextInt();
        System.out.println("arr1: ");
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        
        // Input for second array
        System.out.println("n2: ");
        int n2 = sc.nextInt();
        System.out.println("arr2: ");
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        
        // Merge the two arrays
        int length = n1 + n2;
        int[] mergeArr = new int[length];
        
        for(int i = 0; i < n1; i++){
            mergeArr[i] = arr1[i];
        }
        for(int i = 0; i < n2; i++){
            mergeArr[n1 + i] = arr2[i];
        }
        
        // Print merged array
        System.out.println("mergeArray: ");
        for(int i = 0; i < mergeArr.length; i++){
            System.out.println(mergeArr[i]);
        }
    }
}
