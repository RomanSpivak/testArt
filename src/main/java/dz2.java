//
//1) Вычислить факториал числа n. n! = 1*2*…*n-1*n;
//2) Вывести число, которое является зеркальным отображением
//последовательности цифр заданного числа, например, задано число 123, вывести 321
//
public class dz2 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(zerkalo(123));
    }

    /////////////////////////////////////
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static String zerkalo(int b) {
        StringBuffer buf = (new StringBuffer(String.valueOf(b)).reverse());
        return String.valueOf(buf);
    }
}