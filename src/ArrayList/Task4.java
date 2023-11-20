package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public void task4(){
        /*
         Напишите Java-программу для извлечения элемента (по указанному индексу)
         из заданного списка массивов.
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("qwe");
        stringList.add("1");
        stringList.add("2");
        stringList.add("123");

        System.out.println(stringList);
        System.out.println(stringList.get(2));
    }
}
