/**
 * @className: Code03_BubbleSort
 * @Description: 冒泡排序
 * @version: v1.８.0
 * @author: chz
 * @date: 2023/7/25 18:17
 **/

public class Code03_BubbleSort {
    public static void main(String[] args) {
        int[] a = {12, 23, 24, 242, 2, 16, 53, 45, 76, 42, 44};
        printArray(a);
        bubbleSort(a);
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

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
                printArray(arr);
            }
        }
    }
}
