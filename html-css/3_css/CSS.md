# CSS
## CSS的编写位置
### 行内样式
- 写在标签的style属性中
- `<h1 style:.....></h1>`
### 内部样式
- 写在html页面内部，将所有的CSS代码提取出来，单独放在style标签中
- 注意点：理论上可以放在html中的任何地方，但是一般都放在head中
- 问题：并没有实现结构与样式的完全分离，多个html页面无法复用样式
### 外部样式
- 写在单独的.css文件中，随后在`html`文件中引入使用
- 新建一个扩展名为`.css`的文件，把所有的css代码放入其中
- html文件中引入`.css`文件
```html
<link rel="stylesheet" href="./.....css">
```
- 注意点  
- link标签要写在head中
- href指的是引入的文档来自于哪里
- rel说明引入的文档与当期那文档之间的关系
- 外部样式的优势：样式可以服用、结构清晰、可以触发浏览器的缓存机制，提高访问速度 

## 样式表的优先级
- 优先级规则：行内样式 > 内部样式 = 外部样式  
行内样式的优先级是最高的

## CSS语法规范
1. 选择器：找到要添加样式的元素
2. 声明块：设置具体的样式，格式为：`属性名+属性值`

## CSS代码风格
```
<!-- 展开 -->
h1 {
    color: red;
    font-size: 40px;
}
```
```
<!-- 紧凑 -->
h1{color:red;font-size}
```
占用的体积大小会是不一样的，一个适合开发，一个适合构建上线

## 基本选择器

### 通配选择器
`*{
}` 选择所有的元素，在清楚样式的时候会比较有作用

### 元素选择器
1. 作用：为页面中某种元素统一设置样式
2. 语法：`标签名{属性名：属性值}`
3. 无法差异化

### 类选择器
1. 作用：根据元素的class值，来选中某些元素
2. 语法`.类名 {}`
3. 注意：  
    - 元素的class属性值不带.，但是css的类选择器要带
    - class值是我们自定义的，按照标准，不能是纯数字，不要使用中文
    - 一个元素不能写多个class，但是可以将类名写在一个class内，空格隔开即可
### id选择器
1. 作用：根据元素的id属性值，来精准的选中某个元素
2. 语法：`#id值 {}`
3. 注意
    - id属性值尽量由字母、数字、下划线、短杠组成，最好以字母开头，不要有空格
    - 一个元素只能有一个id属性，多个元素的id属性值不能相同
    - 一个元素可以同时拥有id与class属性

## 复合选择器
### 交集选择器
1. 作用：选中同时符合多个条件的元素
2. 语法：选择器1选择器2选择器3...
3. 注意：
    - 有标签名，标签名必须写在前面
    - id选择器、理论是可以作为交集的条件，但是在实际应用中基本不用，因为没什么意义
    - 交集选择器中不可能出现两个元素器，因为一个元素不可能既是一个又是另一个
    - 用的最多的交集选择器是：元素选择器配合类名选择器，例如：p.beauty
### 并集选择器
1. 作用：选中多个选择器对应的元素，又称：分组选择器
2. 语法：选择器1,选择器2,.....
3. 注意：
    - 并集选择器一般竖着写
    - 任何选择器，都可以作为并集选择器的一部分
    - 并集选择器，通常用于集体声明，可以缩小样式表体积
### 后代选择器
1. 作用：选择指定元素中，符合要求的后代元素
2. 语法： 选择器1 选择器2，代表选择器1中的选择器2
3. 注意：
    - 后代选择器最终选择的是后代，不选择祖先
    - 儿子孙子重孙子都算是后代
    - 结构一定要符合html嵌套要求，不能在p中写h1-h6
### 子代选择器
1. 作用：选择指定元素中，符合要求的子元素
2. 语法：选择器1>选择器2
3. 注意：
    - 子代选择器，最终选择的是子代，不是父
    - 只有子元素
### 兄弟选择器
#### 相邻兄弟选择器：
1. 作用：选中指定元素后，符合条件的相邻兄弟元素
2. 语法：+
#### 通用兄弟选择器：
1. 作用：选中指定元素后，符合条件的所有兄弟元素
2. 语法：~
#### 注意：
- 选择的是下面的兄弟
### 属性选择器
1. 作用：选中属性值符合一定要求的元素
2. 语法：
    - [属性名] 选中具有某个属性
    - [属性名="xxx"] 选中包含某个属性且属性值等于指定值的元素
    - [属性名^="xxx"] 选中包含某个属性且开头为xxx的元素
    - [属性名$="xxx"] 选中包含某个属性且结尾为xxx的元素
    - [属性名*="xxx"] 选中包含某个属性且属性值包含xxx的元素
### 伪类选择器
1. 作用：选中特殊状态的元素
#### 动态伪类
1. link 超链接未被访问
2. visited 超链接访问过
3. hover 鼠标悬停在元素上的装填
4. active 元素激活的状态  
`要遵循LVHA的顺序`
5. focus 获取焦点的元素，只有表单类的元素可以输入的才有此属性
#### 结构伪类
1. 常用
    - :first-child -> 所有兄弟元素中的第一个
    - :last-child -> 所有兄弟元素的最后一个
    - :nth-child() -> 所有兄弟元素中的第n个
    - :first-of-type -> 所有同类型元素的第一个
    - :last-of-type -> 所有同类型元素的最后一个
    - :nth-of-type -> 所有同类型兄弟元素的第n个  

    ```html
        // 注意这边的n的计算是从1开始而非从0开始
        关于n的值
        1. 0或者不写：什么都选不中
        2. n：选中所有的子元素
        3. 1~正无穷：选中对应序号的子元素
        4. 2n或者even:选中偶数
        5. 2n+1或者odd：选中奇数
        6. -n + 3:选中的是前三个
    ```
2. 了解即可
    - :nth-last-child(n) -> 所有兄弟元素中的倒数第n个
    - :nth-last-of-type(n) -> 所有同类型兄弟元素中的倒数第n个
    - :only-child -> 选择没有兄弟的元素
    - :only-of-type -> 选择没有同类型兄弟的元素
    - :root -> 根元素
    - :empty -> 内容为空元素
#### 否定伪类
- :not() -> 排除满足括号中条件的元素
#### UI伪类
- :checked -> 被选中的复选框或单选按钮
- :enable -> 可用的表单元素
- :disable -> 不可用的表单元素
#### 目标伪类
- :target -> 选中锚点指向的元素
#### 语言伪类
- :lang() -> 根据指定的语言选择元素 
### 伪元素选择器
1. 作用：选中元素中的一些特殊位置
2. 常用伪元素：
    - ::first-letter -> 选中元素中的第一个文字
    - ::first-line -> 选中元素中的第一行文字
    - ::selection -> 选中被鼠标选中的内容
    - ::palceholder -> 选中输入框的提示文字
    - ::before -> 在元素最开始的位置，创建一个子元素（必须用content来制定内容）
    - ::after -> 在元素最后的位置，创建一个子元素...
### 选择器的优先级
通过不同的选择器，选中相同的元素，并且为相同的样式名设置不同的值时，就会发生样式的冲突
- 简单描述：行内 > ID > 类 > 元素选择器 > 通配选择器
- 详细描述：
    1. 每个选择器都可以计算出一组权重，格式为：`(a, b, c)`
    - a: id选择器的个数
    - b: 类、伪类、属性选择器的个数
    - c: 元素、伪元素选择器的个数
    2. 比较规则：按照从左到右的顺序，依次比较大小
    3. 行内权重大于所有选择器、！important的权重，大于行内样式，大于所有选择器，权重最高

## CSS的三大特性
### 1. 层叠性
- 概念：如果发生了样式冲突，那就回根据一定的规则（选择器的优先级），进行样式的层叠
### 2. 继承性
- 概念：元素会自动拥有其父元素、或其祖先元素上所设置的某些样式
- 规则：优先继承离得近的
- 常见的可继承属性：text-??, font-??, line-??
- 备注：可以参考MDN网站
### 3. 优先级
- !important > 行内样式 > ID选择器 > 类选择器 > 元素选择器 > * > 继承的样式
- 计算权重