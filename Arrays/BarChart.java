import java.util.Scanner;

public class BarChart {
    public static void main(String []args){
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter index of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Insert array:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i] ; j++){
                if(arr[i]> max){
                    max= arr[i];
                }  
            }
        }  

        //for print
        for(int i=max; i>0;i--){
            //let's say  i= 5, 4, 3, 2,1 for every passing loop
            for(int j=0;j<arr.length;j++){ // let's element in an array 2, 4,5,4  max value is 5 so element cannot be greater than 5

                if(arr[j]>=i){ // i=5  arr[0]=2, arr[1]=4, arr[2]=5, arr[3]=4  So, print("") except arr[2]
                    //i=4  arr[0]=2, arr[1]=4, arr[2]=5, arr[3]=4  So, print('*')  arr[2],arr[3],arr[1]
                    //i=3  arr[0]=2, arr[1]=4, arr[2]=5, arr[3]=4  So, print('*')  arr[2],arr[3],arr[1]
                    //i=2  arr[0]=2, arr[1]=4, arr[2]=5, arr[3]=4  So, print('*')  arr[2],arr[3],arr[1],arr[0]
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
