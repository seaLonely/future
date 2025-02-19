// 此处是可以自动创建文档的注释
/**
 * @author: cherish
 * @date: 2025/2/18
 * @description: Java程序的基本结构
 */

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    // public是访问修饰符
    // 表示class是公开
    public static void main(String[] args) {
        // 向屏幕输出文本
        System.out.print("Hello and welcome!");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

        // 变量
        int x = 1;
        System.out.println("x = " + x);

        // 再次赋值
        x = 2;
        System.out.println("x = " + x);

        // 变量之间的赋值
        int y  = 5;
        x = y;
        System.out.println("X = " + x);

        // 整数运算
        int i = (100 + 200) * (99 - 88);
        System.out.println(i);

        // 自增++
        i++;
        // 自减--
        i--;

        // 移位运算
        int n = 7;
        int a = n >> 1; // 14

        // 位运算
        // &
        // |
        // ~
        // ^

        // 数组类型

        // 数组
        int[] stus = new int[5];
        stus[0] = 100;
        stus[1] = 200;
        stus[2] = 300;
        stus[3] = 400;
        stus[4] = 500;
        System.out.println(stus);
    }
}