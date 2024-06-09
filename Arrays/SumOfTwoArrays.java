import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {

         Scanner scn = new Scanner(System.in);

        System.out.println("Insert index of 1st array");
        int n1=scn.nextInt();
        System.out.println("Enter the elements:");
        int []arr1= new int[n1];
        defineArray(arr1);
        
       
        System.out.println("Insert index of 2nd array");
        int n2=scn.nextInt();
        System.out.println("Enter the elements:");
        int []arr2= new int[n2];
        defineArray(arr2);

        int []sumArr= new int[n1>n2? n1:n2];
        int i = arr1.length-1;
        int j=arr2.length-1;
        int k= sumArr.length-1;
        int carry= 0;

        while(k>=0){
            int d=carry;
            if(i>=0){
                d +=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            carry=d/10;
            d=d%10;
            sumArr[k]= d;
            i--;
            j--;
            k--;

        }
        if(carry!=0){
            System.out.println(carry);

        }
        for(int val: sumArr){

            System.out.println( val);
        }
      
    }
    public static void defineArray(int []arr){
        Scanner scn = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    
}
