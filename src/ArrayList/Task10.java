package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10 {
    public void task10(){
        /*
        Напишите программу на Java для перемешивания элементов в списке массивов.
         */

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
