/**
 * @className: Code02_SelectionSort
 * @Description: 选择排序
 * @version: v1.８.0
 * @author: chz
 * @date: 2023/7/21 14:02
 **/

public class Code02_SelectionSort {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
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
    public static void main(String[] args) {
        int[] a = {12, 23, 24, 242, 2, 16, 53, 45, 76, 42, 44};
        printArray(a);
        selectSort(a);
        printArray(a);
    }
}
