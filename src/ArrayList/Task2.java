package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public void task2(){
        /*
        Напишите Java-программу для итерации всех элементов списка массивов
         */
        List list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add("qwerty");
        list.add("asd");

        System.out.println(list);
        System.out.println();
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
