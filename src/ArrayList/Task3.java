package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public void task3(){
        /*
        Напишите Java-программу для вставки элемента в список массивов в первой позиции.
         */

        List<String> stringList =new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Red");
        stringList.add("Intel");

        System.out.println(stringList);

        stringList.add(0,"1");

        System.out.println(stringList);
    }
}
