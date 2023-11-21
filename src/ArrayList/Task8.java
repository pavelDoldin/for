package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task8 {
    public void task8(){
        /*
        Напишите программу на Java для сортировки заданного списка массивов
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("String");
        stringList.add("Integer");
        stringList.add("3");

        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
