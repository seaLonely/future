# 快速入门
## java入门_demo_01
Java之父——詹姆斯·高斯林
### 名词解释
- `jdk`: Java Development Kit
- `JRE`: Java Runtime Environment  
jre是运行java字节码的虚拟机
通过JDK将Java源码编译成Java字节码  
JDK内包含JRE
### 开发环境
- IDE：`IDEAL`
- JDK：`22`
### Java运行
``` java
    // 编译
    javac Hello.java
    // 运行
    java Hello
```
## java程序基础_demo_02
### 基本的程序结构
``` java
// 变量之间的赋值
public class Main {
    public static void main(String[] args) {
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
   }
}
```
### 基本的数据类型
- 整数类型：`byte`,`short`,`int`,`long`
- 浮点数类型：`float`,`double`
- 字符类型：`char`
- 布尔类型：`boolean`
1. 整型
    - byte: -128~127
    - short: -32768~32767
    - int: -2147483648 ~ 2147483647
    - long: -9223372036854775808 ~ 9223372036854775807
2. 浮点型
    - 3.14f
    - 3.14e38f=3.14x10^8
    对于float类型需要加上f后缀
3. 布尔类型
    只有true和false两个类型的值
4. 字符类型
    char表示一个字符
5. 引用类型
    `String s = "hello"`
6. 常量(final修饰符)
    - final double PI = 3.14
    - 不可修改再次赋值
7. var 关键字
    - StringBuilder sb =  new StringBuiler()
    - var sb = new StringBuiler()
8. 变量的作用范围
    - 就是从定义处开始，到语句块结束
### 整数运算
- `--` 自减
- `++` 自增
- `>>` 移位运算
- `&` 与运算
- `|` 或运算
- `^` 异或运算
- `~` 非运算
### 浮点数运算
浮点数只能进行加减乘除这些数值计算，不能做位运算与移位运算  
PS：浮点数常常无法精确表示，存在精度缺失的情况
### 布尔运算
- 比较预算符: `>`, `>=`, `<`, `<=`, `==`, `!=`
- 与运算: `&&`
- 或运算: `||`
- 非运算: `!`

- 三元运算符: `b ? x : y`
### 字符和字符串
1. 字符类型  
char是基本数据类型
2. 字符串类型  
- String  
- 常见的转义字符：
    - `\"` "
    - `\'` '
    - `\\` \
    - `\n` 换行
    - `\r` 回车
    - `\t` tab
- 使用`+`可以字符串连接
- 多行可以使用`"""..."""`
- 空值null
### 数组类型
- 定义一个数组类型的变量，类型[]，如：`int[]`
- 特点：
    - 数组所有元素的初始化为默认值。整型都为0，浮点数为：0.0
    - 数组一旦创建后大小就不可变
- 可以通过`数组.length`来获取数组的长度
- 数组为引用类型
- 初始化时直接指定值
```
    int[] ns = new int[] {1, 2, 3, 4, 5}
```

## 流程控制_demo_03
### 输出
`println` -> `print line` 表示输出并换行
```
    %d 格式化输出整数
    %x 十六进制整数
    %f 格式书输出浮点数
    %e 格式化输出科学计数法表示的浮点数
    %s 格式化字符串
    %% 表示%本身
```
### 输入
java的输入比较复杂  
通过Scanner来进行实现
### if
### switch
### while
### do while
### for
### break && continue

## 数组操作_demo_04
- 遍历
- 排序
### 遍历数组
### 数组排序
### 多维数组
### 命令行参数
main中可以接受一个args参数

# 面向对象编程
## 面向对象基础
### 方法