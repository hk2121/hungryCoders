package ArraysDSA;

public class Marks {
    public static void main(String[] args) {
        int[] marks = {100,95,87,34,56,18,29};
        for(int i =1;i<=marks.length-1;i++){
            if(marks[i] >= 30){
                System.out.println("Passed Student "+marks[i]);
//            }else{
//                System.out.println("Failed Student "+marks[i]);
            }
        }
    }
}
