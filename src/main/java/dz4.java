//Написать функции преобразования:
//        1)целого числа в строку
//        2)вещественного числа в строку
//        3)строки в целое число
//        4)строки в вещественное число
//        5)Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова
//        6)Подсчитать количество слов во введенной пользователем строке
//        7)В заданной строке удалить последнее слово

import java.util.Arrays;

public class dz4 {
    public static void main(String[] args) {
        System.out.println(task1(123));
        System.out.println(task2(1.123f));
        System.out.println("Min word in sentence have length: " + task5("Hello world, my name is: Roman. How are you? I'm fine"));
        System.out.println(task34());
    }

    public static String task1(int a) {
        String as = Integer.toString(a);
        return as;
    }

    public static String task2(float b) {
        String bs = Float.toString(b);
        return bs;
    }

    public static String task34() {
        String result = "";
        try {
            Integer i1 = new Integer("120");
            result += i1 + " ";
        } catch (NumberFormatException e) {
            result += "Неверный формат строки!" + " ";
        }
        try {
            Float f1 = new Float("123.5");
            result += f1;
        } catch (NumberFormatException e) {
            result += "Неверный формат строки!";
        }
        return result;
    }

    public static String task5(String str) {
        String[] parts = str.split("[,;:.!?\\s]+");

        int count = Integer.MAX_VALUE;
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() < count)
                count = parts[i].length();
//            System.out.println(parts[i]);
        }

        int ksim = parts.length - 1;
        String[] copy = Arrays.copyOf(parts, ksim);
        String copyprint = Arrays.toString(copy);
        return count + ", " + parts.length + ",  " + copyprint;
    }
}