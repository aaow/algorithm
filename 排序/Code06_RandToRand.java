/**
 * @className: Code06_RandToRand
 * @Description: 随机  /等概率发生器
 * @version: v1.８.0
 * @author: chz
 * @date: 2023/8/14 22:46
 **/

public class Code06_RandToRand {
    public static void main(String[] args) {
        System.out.println("start:");
        double ans = Math.random();
        System.out.println(ans);

        int testTimes = 10000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random() < 0.75) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);
        int count1 = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random()*8 < 5) {
                count1++;
            }
        }
        System.out.println("等概率");
        System.out.println((double) count1 / (double) testTimes);
        System.out.println((double) 5 / (double) 8);

        int k = 9;
        int[] counts = new int[9];
        for (int i = 0; i < testTimes; i++) {
            int ans1 = (int) (Math.random() * k);
            counts[ans1]++;
        }
        for (int i = 0; i < k; i++) {
            System.out.println(i+"有"+counts[i]+"个");
        }
        count = 0;
        double x = 0.63;
        for (int i = 0; i < testTimes; i++) {
            if (xToxPower2() < x) {
                count++;
            }
        }
        System.out.println("概率的平方");
        System.out.println((double) count / (double) testTimes);
        System.out.println(Math.pow(x, 2));

        System.out.println("根据1-5返回1-7的等概率随机");
        count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (f2() == 0) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);

        System.out.println("返回1-7的等概率随机");
        counts = new int[8];
        for (int i = 0; i < testTimes; i++) {
            int num = f3();
            counts[num]++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " 有 " + counts[i] + " 个");
        }

        System.out.println("返回1-6的等概率随机");
        counts = new int[8];
        for (int i = 0; i < testTimes; i++) {
            int num = f4();
            counts[num]++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " 有 " + counts[i] + " 个");
        }

        System.out.println("根据不等概率返回等概率随机");
        counts = new int[8];
        for (int i = 0; i < testTimes; i++) {
            int num =y();
            counts[num]++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " 有 " + counts[i] + " 个");
        }
    }
    //返回【0，1）的一个小数，任意x，x属于【0，1），【0，x）范围上的数出现的概率由原来的x调整成x的平方
    public static double xToxPower2() {
        return Math.max(Math.random(), Math.random());
    }
    //有一个函数 返回1-5的等概率随机
    public static int f1() {
        return (int) (Math.random() * 5) + 1;
    }
    //根据f1返回一个 1-7的等概率随机
    public static int f2() {
        int ans = 0;
        do {
            ans = f1();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }
    public static int f3() {
        return (f2() << 2) + (f2() << 1) + (f2() << 0);
    }
    //0-6的等概率
    public static int f4() {
        int ans = 0;
        do {
            ans = f3();
        } while (ans == 7);
        return ans;
    }

    //不等概率
    public static int x() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    //根据不等概率求等概率
    public static int y() {
        int ans = 0;
        do {
            ans = x();
        } while (ans == x());
        return ans;
    }
}
