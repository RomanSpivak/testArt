 //
//1) Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
//2) Отсортировать массив (пузырьком (Bubble)
//
public class dz3 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 3, 0};
        int len = arr.length / 2;
        int pos = len + arr.length % 2;
        for (int i = 0; i < len; i++) {
            int t = arr[i];
            arr[i] = arr[pos + i];
            arr[i + len] = t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        ////////////////////////////////////////
        boolean Sort = false;
        int buf;
        while (!Sort) {
            Sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    Sort = false;
                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}