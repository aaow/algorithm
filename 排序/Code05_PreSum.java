
/**
 * @className: Code05_PreSum
 * @Description: 求数组 L-R范围内的和
 * @version: v1.８.0
 * @author: chz
 * @date: 2023/8/14 22:16
 **/

public class Code05_PreSum {
    public static void main(String[] args) {
        int[] arr = {42, 13, -2, 6, 14, 52, 4, 86, 23, 9};
        RangeSum1 rs1 = new RangeSum1(arr);
        System.out.println(rs1.rangeSum(2, 8));
        RangeSum2 rs2 = new RangeSum2(arr);
        System.out.println(rs2.rangeSum(2, 8));
    }

    public static class RangeSum1{
        private int[] arr;

        public RangeSum1(int[] array) {
            arr = array;
        }

        public int rangeSum(int L, int R) {
            int sum = 0;
            for (int i = L; i <= R; i++) {
                sum += arr[i];
            }
            return sum;
        }
    }
    public static class RangeSum2{
        private int[] preSum;

        public RangeSum2(int[] array) {
            int N = array.length;
            preSum = new int[N];
            preSum[0] = array[0];
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i - 1] + array[i];
            }
        }

        public int rangeSum(int L, int R) {
            return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
        }
    }
}
