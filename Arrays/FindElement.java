import java.util.Scanner;

public class FindElement {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter index of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Insert array:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter target value");
        int target=sc.nextInt();
        int idx=-3;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                idx=i;
                break;
            }
        }
        System.out.println("Index of target value:"+ idx);
    }
}
