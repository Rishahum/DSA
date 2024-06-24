import java.util.Scanner;
public class BInarySearchAlgo {
    public static void main(String []args){
        
        // Array should be sorted always
        int []a = {10, 20, 30, 40, 50, 60, 70};

        int data = 60;

        int l =0;
        int h=a.length;

        while(l<=h){
            int mid= (l+h)/2;
            if(data<a[mid]){
                h=mid-1;
            }else if(data>a[mid]){
                l=mid+1;
            }else{
                System.out.println(mid);
                return;
            }
           
        }
        System.out.println("not present");
        
    }
}
