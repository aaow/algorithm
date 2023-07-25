/**
 * @className: Code01_Print
 * @Description: 位运算，十进制打印成二进制 ，一个数左移1位相当于*2
 * @version: v1.８.0
 * @author: chz
 * @date: 2023/7/20 17:00
 **/

public class Code01_Print {
    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        print(num);
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
