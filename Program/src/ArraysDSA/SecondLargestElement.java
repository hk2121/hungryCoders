package ArraysDSA;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,2,8,7,6,1};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)
                max= arr[i];
        }
        int smax= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i] != max)
                smax=arr[i];
            }
            System.out.println("FirstLargestElement : "+max);
            System.out.println("SecondLargestElement : "+smax);
        }
    }

