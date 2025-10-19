package ArraysDSA;

public class GreaterElement {
    public static void main(String[] args) {
        int[] arr = {29, 87, 67, 9, 6, 1, 5};
        int x = 6;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>x)
                count++;
        }
        System.out.println(count);
//        System.out.println(arr.[i]);
    }
}
