package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public void task6(){
        /*
         Напишите программу на Java для удаления третьего элемента из списка массивов.
         */
        List list = new ArrayList<>();
        list.add("qwe");
        list.add("1");
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);
    }
}
