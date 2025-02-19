import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        // println -> print line 表示输出并换行
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
            System.out.println("i = " + i);
        }

        // 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your name:");
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.println("input your age:");
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.println("name = " + name + ", age = " + age);
        System.out.printf("name: %s, age: %d\n", name, age);
    }
}