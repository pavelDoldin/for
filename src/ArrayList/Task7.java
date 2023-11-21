package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task7 {

    public void task7(){
        /*
        Напишите программу на Java для поиска элемента в списке массивов.
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("Integer");
        stringList.add("String");
        stringList.add("ArrayList");
        stringList.add("List");

        //String str = "1";
        String str = "String";

        if (stringList.contains(str)){
            System.out.println("Элемент: " + str + " есть в колекции");
        }
        else {
            System.out.println("Такого элемента: " + str +  " нет в колекции");
        }
    }
}
