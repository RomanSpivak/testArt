//        1)Если а – четное посчитать а*б/с,
//                если ""а+с"" или ""b+c"" четное - посчитать ""a"" возведенную в степень ""c""
//        иначе посчитать а+б-с
//        2) Определить какой области принадлежит точка с координатами (х,у,z)

import static java.lang.Math.pow;

public class dz1 {
    public static void main(String[] args) {
        System.out.print(First(10, 15, 2));
        System.out.println(" ");
        System.out.println(Second(-3, 5, -9));
    }

    public static int First(int a, int b, int c) {
        int result = 0;
        if (a % 2 == 0) {
            result += (a * b / c);
        }
        int resultSec = 0;
        if ((a + c) % 2 == 0 || (b + c) % 2 == 0) {
            resultSec +=((int) pow(a, c));
        } else {
            resultSec += (a + b - c);
        }
        return result;
    }

    //////////////////////////////////////////////////
    public static int Second(int x, int y, int z) {
        int result = 0;
        if (x > 0 && y > 0 && z > 0) {
            result += 1;
        } else if (x > 0 && y < 0 && z < 0) {
            result += 6;
        } else if (x > 0 && y < 0 && z > 0) {
            result += 5;
        } else if (x < 0 && y > 0 && z < 0) {
            result += 3;
        } else if (x < 0 && y < 0 && z > 0) {
            result += 7;
        } else if (x < 0 && y > 0 && z > 0) {
            result += 4;
        } else if (x > 0 && y > 0 && z < 0) {
            result += 2;
        } else if (x < 0 && y < 0 && z < 0) {
            result += 8;
        }
        return result;
    }
}