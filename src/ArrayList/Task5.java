package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public void task5(){
        /*
         Напишите Java-программу для обновления определенного элемента массива по заданному элементу.
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println(integerList);
        integerList.set(1, 4);
        System.out.println(integerList);
    }
}
