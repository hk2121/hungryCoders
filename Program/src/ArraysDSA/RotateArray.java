package ArraysDSA;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n=arr.length;
        int k=2;
        int temp=0;

        for(int i=0;i<k;i++){
            int length = arr[n-1];
            for(int j=n-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(arr);
    }
}
