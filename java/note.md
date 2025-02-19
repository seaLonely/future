# 快速入门
## java入门_demo_01
java是一种编译型语言  
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
## 面向对象基础_demo_05
### 方法
- 一个class可以包含多个field
- 使用private、public等修饰符来对field进行修饰
- 定义方法的语法
```
    修饰符 方法返回类型 方法名（方法参数列表） {
        若干方法语句;
        return 方法返回值
    }
```
- private 方法
    - 不允许外部调用
- this 变量
- 方法参数
    - 可以包含0个或任意个参数
    - 调用方法时，必须严格按照参数的定义一一传递
- 可变参数
    - `String... names` 写的时候可以这样去写数组，可以传入任意个name，比较方便
- 参数绑定
    - 注意引用类型的参数
### 构造方法
创建实例的时候，通常需要同时初始化这个实例的字段  
通过构造方法来进行实现
- 默认的构造方法
- 多个构造方法
    - 编译器通过构造方法的参数数量、位置和类型自动区分
### 方法重载
在一个类中，有一系列方法，功能类似，参数不同，可以写一组同名方法。
### 继承
- 子类自动获得了父类的所有字段
- Person类可以称为：超类、父类、基类
- Student类可以称为：子类、扩展类
- 当未写extends的时候，默认继承自Object
- protected
    - 子类无法访问父类的private
- 父类没有默认的构造方法，子类就必须显式调用super并给出参数定位到父类的一个合适的构造方法
- 阻止继承
    - 只要没有final修饰符，那么任何类都可以从该class继承
    - java15后，可以使用sealed修饰class，然后使用permits指定可以继承的子类名称防止继承被滥用
- 向上转型
    - 可以把Student转换为Person
- 向下转型
    - 父类类型强制转换为子类类型，就是向下转型
    - 通过 `instanceof` 来进行判断，判断成功之后就可以转型
### 多态
继承关系中，若子类定义了一个与父类方法签名完全相同的方法，被称为覆写(override)
- 方法签名相同？  
指的是方法名相同的时候，形参列表、返回值也相同。需要区分清楚覆写与重载overload
- @Override  
可以让编译器帮助检查是否进行了正确的覆写。并非是必须的
- java的实例方法调用是基于运行时候的实际类型进行的调用，而非引用类型 -> 多态
- 多态是指，针对某个类型的方法调用，其真正执行的时候取决于运行时期的实际类型的方法
### 抽象类
由于多态的存在，每个子类都可以覆写父类的方法
- 一个calss定义了方法，但是没有具体的执行代码，这个方法就是抽象方法。使用`abstract`修饰
- 使用abstract修饰的类就是抽象类，无法实例化
- 面向抽象编程
    - 尽量引用高层类型，避免引用实际子类型的方式，称之为面向抽象编程
### 接口
在抽象类中，抽象方法本质上是定义接口的规范  
- 规定高层类的接口，从而保证所有子类都有相同的接口实现
- 当一个抽象类没有字段，所有方法全部都是抽象方法，就可以把该抽象类改写为接口`interface`
- 所谓接口就是比抽象类还要抽象的纯抽象接口，连字段都不能有
- 当一个具体的class去实现一个`interface`的时候，需要使用`implements`关键字
- 定义：表示一个接口类型和一组方法签名
- 继承：一个interface可以继承自另一个interface。相当于扩展了接口的方法
- default方法
    - 实现类可以不去覆写default方法
    当我们需要给接口新增一个方法的时候，会涉及到修改全部子类。如果新增的是default，那么子类就不必全部修改
### 静态字段和静态方法
1. 静态字段  
`static` 修饰  
所有的当前实例，都是共享该字段的
2. 静态方法
属于class而不属于实例，因此是无法访问this变量的，也无法访问实例字段，只能访问静态字段。  
常用与工具类
    - Arrays.sort()
    - Math.random()
3. 接口的静态字段  
interface是一个纯抽象类，所以是不能定义实例字段的。  
但是是可以有静态字段的，且静态字段必须为final类型，无法修改。
### 包
使用package来解决类名的冲突
### 作用域
1. public  
可以被任何其他类访问
2. private  
无法被其他类访问，private的权限被限定在class内部，且与方法声明顺序无关  
若存在嵌套类，那么嵌套类也是拥有访问权限的
3. protected
protected作用于继承关系  
定义为protected的字段和方法可以被子类访问，以及子类的子类
4. package  
是指一个类允许访问同一个package的没有public、private修饰的class
5. 局部变量  
声明处到对应的块结束
### 内部类
1. inner class  
如果一个类被定义 在另一个类的内部，则是内部类
内部类的创建需要有一个外部类，不能脱离外部类的实例
2. Anonymous Class  
通过匿名类来进行实现
3. Static Nested Class 静态内部类
### classpath 和 jar
1. classpath  
是jvm使用到的一个环境变量，用来指示jvm如何搜索class
2. jar包  
可以把package组织的目录层级，以及各个目录下的所有文件都打成一个jar文件  
### class版本
### 模块
## Java核心类_demo_06
### 字符串和编码
#### 字符串比较 equal
#### 去除首尾的空白字符 trim
#### 替换字符串
```
    String s= "hello";
    s.replace("l", "w"); // 所有的l就会被换成w
```
#### 分割字符串
```
    String s = "a,b,c,d";
    String[] ss = s.split("\\,");
```
#### 拼接字符串
使用静态方法join  
``` java
    String[] arr = {"a", "b", "c"};
    String s = String.join("****", arr);
```
#### 格式化字符串
fromatted && format
``` java
    String s = "Hi %s, your score is %d";
    System.out.println(s.formatted("Alice", 80));
    System.out.println(String.format("Hi %s, your score is %.2f", "Bob", 59.5))
```
#### 类型转换
1. 任意基本类型转换为字符串(valueof)
``` java
    String.valueOf(123); // "123"
```
2. 把字符串转换为其他类型，需要根据实际的情况
``` java
    int n1 = Integer.parseInt("123"); // 123
    int n2 = Integer.parseInt("ff", 16); // 按16进制转换，255

    // 转换为boolean
    boolean b1 = Boolean.parseBoolean("true"); // true
    boolean b2 = Boolean.parseBoolean("false"); // false
```
3. 转换为char[]  
String 与 char[] 可以互相转换
``` java
    char[] cs = "Hello".toCharArray(); // String -> cahr[]
    String s = new String(cs); // char[] -> String
```
如果修改了char[]，String并不改变
### StringBuilder
用于高效拼接字符串  
```
    StringBuilder sb = new StringBuilder(1024);
    for (int i = 0; i < 1000; i++) {
        sb.append(',');
        sb.append(i);
    }
    String s = sb.toString();
```
### StringJoiner
实现用分隔符拼接数组  
``` java
    String[] names = {"Bob", "Alice", "Grace"};
    // Hello 与 ！是在指定开头与结尾
    var sj = new StringJoiner(", ", "Hello", "!");
    for (String name : names) {
        sj.add(name);
    }
    System.out.println(sj.toString())
```
- String.join
``` java
    String[] names = {"Bob", "Alice", "Grace"};
    var s = String.join(", ", names);
```
### 包装类型
#### 基本类型与引用类型
    - boolean->Boolean
    ...
#### 进制转换
``` java
    int x1 = Integer.parseInt("100"); // 100
    int x2 = Integer.parseInt("100", 16); // 256，按16进制进行解析
```
常用的静态变量
``` java
    // boolean只有两个值true/false，其包装类型只需要引用Boolean提供的静态字段:
    Boolean t = Boolean.TRUE;
    Boolean f = Boolean.FALSE;
    // int可表示的最大/最小值:
    int max = Integer.MAX_VALUE; // 2147483647
    int min = Integer.MIN_VALUE; // -2147483648
    // long类型占用的bit和byte数量:
    int sizeOfLong = Long.SIZE; // 64 (bits)
    int bytesOfLong = Long.BYTES; // 8 (bytes)
```
### JavaBean
主要用来传递数据
### 枚举类
- enum
```
    enum Weekday {
        SUN, MON, TUE, WED, THU, FRI, SAT;
    }
```
1. enum的比较  
    直接使用==
2. enum的类型

### 记录类
`String`,`Integer`这些类型都是不变类
- 特点
    - 定义class时使用`final`，无法派生子类
    - 每个人字段使用`final`，保证创建实例后无法修改任何字段
- Record关键字
    - 就是不去改变定义的属性值，只能被赋值一次
### BigInteger
用来表示任意大小的整数  
`BigInteger`内部有一个`int[]`来模拟一个非常大的整数
- 运算
``` java
    BigInteger i1 = new BigInteger("132412334");
    BigInteger i2 = new BigInteger("1234123421341234");
    BigInteger i3 = i1.add(i2);
```
### BigDecimal
表示一个任意大小且精度完全准确的浮点数
### 常用的工具类
- Math
- HexFormat
- Random
- SecureRandom