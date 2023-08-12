/**
 * @className: Code03_BubbleSort
 * @Description: 查润排序
 * @version: v1.８.0
 * @author: chz
 * @date: 2023/7/25 18:17
 **/

public class Code04_InsetSort {
    public static void main(String[] args) {
        int[] a = {12, 23, 24, 242, 2, 16, 53, 45, 76, 42, 44};
        printArray(a);
//        insetSort1(a);
        insetSort2(a);
        printArray(a);
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void insetSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newNumIndex = end;
            while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                swap(arr, newNumIndex - 1, newNumIndex);
                newNumIndex--;
                printArray(arr);
            }
        }
    }

    public static void insetSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr,pre,pre+1);
                printArray(arr);
            }
        }
    }
}
