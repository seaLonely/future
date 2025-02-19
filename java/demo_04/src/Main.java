import java.lang.reflect.Array;
import java.util.Arrays;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        // 遍历数组

        // 第一种方法
        int[] ns = {1, 4, 5, 8, 9};
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }

        // 第二种方法使用 for each 来进行循环
        for (int n : ns) {
            System.out.println(n);
        }

        System.out.println(Arrays.toString(ns));

        // 数组排序
        int[] nss = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };

        // 多维数组

        // 二维数组
        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(test);

        // 命令行参数
        // java程序的入口是main方法，main方法可以接手后一个命令行参数，它是一个String[]数组
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}