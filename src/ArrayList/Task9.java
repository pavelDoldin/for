package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public void task9(){
        /*
        Напишите программу на Java для копирования одного списка массивов в другой.
         */

        List<String> integerList = new ArrayList<>();

        integerList.add("1");
        integerList.add("5");
        integerList.add("6");
        integerList.add("2");
        integerList.add("3");
        System.out.println(integerList);

        List list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        //list = integerList;
        Collections.copy(list, integerList);
        System.out.println(list);
    }
}









