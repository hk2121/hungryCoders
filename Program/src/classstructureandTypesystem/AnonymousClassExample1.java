package classstructureandTypesystem;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClassExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){
            @Override
            public boolean add(String s){
                System.out.println("Adding element "+ s);
            return super.add(s);
            }
        };
        list.add("Hello");
        list.add("World");
    }
}
