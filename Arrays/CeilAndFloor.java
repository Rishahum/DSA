public class CeilAndFloor {
    public static void main(String []args){
        
        // Array should be sorted always
        int []a = {10, 20, 30, 40, 50, 60, 70};

        int data = 62;
        int l =0;
        int h=a.length;
        int ceil=0;
        int floor=0;

        while(l<=h){
            int mid= (l+h)/2;
            if(data<a[mid]){
                h=mid-1;
                ceil = a[h];
            }else if(data>a[mid]){
                l=mid+1;
                floor=a[l];
            }else{
                System.out.println("same " + a[l]);

                return;
            }
        }
        System.out.println("ceil " + ceil );
        System.out.println("floor " + floor );
    }
}
