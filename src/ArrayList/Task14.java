package ArrayList;

import java.util.*;

public class Task14 {

    public static void main(String[] args) {

        /**
         * Создать List<Integer> из 100 случайных чисел от 0 до 20
         * Создать Iterator удалить все чётные числа
         * Положить колекцию в TreeSet и вывести
         */

        int size = 20;
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(21));
        }
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
    }

}
