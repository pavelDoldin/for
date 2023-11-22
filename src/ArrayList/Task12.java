package ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Task12 {
    void task12(){

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add("q");
        list.add("qw");

        System.out.println(list);

        /**
         * subList вернёт от индекса до индекса
         */
        List<Object> objectList = list.subList(1,5);

        System.out.println(objectList);
    }
}
