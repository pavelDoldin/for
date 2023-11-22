package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task13 {
    void task13(){

        // Напишите программу на Java для сравнения двух списков массивов.

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Wait");
        list1.add("1");

        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("2");
        list2.add("1");

        List<String> list3 = new ArrayList<>();

        for (String s : list1) {
            if (list2.contains(s)){
                list3.add("Yes");
            }
            else {
                list3.add("No");
            }
            //list3.add(list2.contains(s) ? "Yes" : "No");
        }
        System.out.println(list3);
    }
}







