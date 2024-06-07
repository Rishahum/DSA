import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Insert index of array");
        int n = scn.nextInt();
        System.out.println("Insert the number");
        int d = scn.nextInt();

        int count=0;

        int []arr= new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int result = frequency(n,d,arr);
        System.out.print("result " + result);

    }
    public static int frequency(int n, int d, int []arr){
        int count=0;
        for(int i=0;i<n;i++){
            if(d==arr[i]){
                count++;
            }
            
        }
        return count;
    }

}
