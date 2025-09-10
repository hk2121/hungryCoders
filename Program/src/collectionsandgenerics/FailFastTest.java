package collectionsandgenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FailFastTest {
    public void failFast(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            numbers.add(50); // This line will throw error
        }
    }
}
