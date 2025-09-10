package collectionsandgenerics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeTest {
    public void failSafe(){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("a","b","c"));
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("b")){
                list.remove("b"); // This will not cause an exception
            }
        }
        System.out.println(list);//["a","c"]
    }
}
