package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
               /*
     Напишите программу на Java, чтобы создать новый список массивов,
     добавить несколько строк и распечатать коллекцию
     */
    public void task1() {
        List stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("22");
        stringList.add("Море");
        stringList.add(1);

        System.out.println(stringList);
    }
}
