
import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Insert index of 1st array");
        int n1=scn.nextInt();
        System.out.println("Enter the elements:");
        int []arr1= new int[n1];
        int []inv= new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]= scn.nextInt();
        }
        int i=0;
        while(i<arr1.length){
            int temp = arr1[i];
            inv[temp]= i;
            System.out.println(inv[temp] + "elements");
            
            i++;
        }
        for(int j=0; j<inv.length;j++){
            System.out.print("new Array: ");
            System.out.println(inv[j] );
        }
        scn.close();
    }
}
