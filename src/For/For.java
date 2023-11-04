package For;

public class For {
    public static void main(String[] args) {
        ex6();
    }
    static void ex6(){
        //Вывести на экран числа от 5 до 95 включительно с интервалом 10

        int count = 95;
        for (int i = 5; i <= count ; i+=10) {
            System.out.println(i);
        }
    }
    static void ex5(){
        // Вывести на экран числа от 0 до 30 включительно с интервалом 5

        int count = 30;
        for (int i = 0; i <= count; i +=5) {
            System.out.println(i);
        }
    }
    static void ex4(){
        // Найти факториал n - числа

        int count = 5;
        int res = 1;
        for (int i = 1; i <= count; i++) {
            res *= i;
        }
        System.out.println(res);
    }
    static void ex3(){
        /*
        Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        все числа от 1 до введенного пользователем числа.
        Например:
        если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3,
        то есть 1+2+3 и выдать ответ 6.
        если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5,
        то есть 1+2+3+4+5 и выдать ответ 15.
         */
        int sum = 0;
        int count = 5;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    static void ex2(){
        //Необходимо вывести на экран таблицу умножения на 3:
        //В столбик
        //3*1=3 ; 3*2=6 ; 3*3=9 ; 3*4=12 ; 3*5=15 ; 3*6=18
        //3*7=21 ; 3*8=24 ; 3*9=27 ; 3*10=30

        int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println("3 * " + i + " =" + 3*i);
        }
    }
    static void ex1(){
        //Необходимо вывести на экран числа от 5 до 1.
        //На экране должно быть: 5 4 3 2 1
        for (int i = 5; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
    static void ex0(){
        //Необходимо вывести на экран числа от 1 до 5.
        //На экране должно быть: 1 2 3 4 5
        int count = 5;
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }

}
