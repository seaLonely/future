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
        System.out.printf("Hello and welcome!");
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
    }
}