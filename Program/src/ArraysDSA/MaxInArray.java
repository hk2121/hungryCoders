package ArraysDSA;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {29, 7, 167, 9, 6, -11, 5};
//        int max= Integer.MIN_VALUE;
        int max = arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
