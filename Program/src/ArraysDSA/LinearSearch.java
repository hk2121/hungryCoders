package ArraysDSA;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {29, 87, 67, 9, 6, 1, 5};
        int x = 67;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
//                System.out.println("Found element at index "+ i);
                flag = true;
                break;
            }
        }
        if (flag==false) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("FOUND IT");
        }
    }
}
