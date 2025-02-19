## 排版标签
1. h1-h6标签
2. h1-h6不能相互嵌套，例如h1标签中最好不要嵌套h2
3. p标签和特殊，是段落标签，它里面不能有:h1-h6、p、div

## 语义化标签
1. 语义化：标签的默认效果不重要，语义效果最重要
   - 要用特定的标签去表示特定的含义
2. 作用：
    - 代码的可读性强
    - 有利于SEO（搜索引擎的优化） 便于爬虫抓取页面内容
    - 方便设备进行解析（屏幕阅读器等等）

## 行内元素与块级元素
1. 块级元素：独占一行的是块级元素
2. 行内元素：不能独占一行的是行内元素
3. 使用的规则
    - 块级元素中能写行内元素与块级元素
    - 行内元素中只能写行内元素，不能写块级元素
    - 特殊规则：h1-h6不能相互嵌套
    - 特殊规则：p标签中不要写块级元素，虽然他是块级元素

## 常用的文本标签
1. 用于包裹：词汇、短语等
2. 通常写在排版标签中  
3. em -> 要着重阅读的内容
4. strong -> 十分重要的内容，语气比em强
5. span -> 没有语义，用于包裹短语的通用容器

## 不常用的文本标签
1. cite -> 作品标签
2. dfn -> 专属的名词或者定义
3. del/ins -> 删除的文字/插入的文字
4. sub/sup -> 上标与下表
5. code -> 一段代码
6. samp -> 提取内容
7. kbd -> 键盘文本
8. abbr -> 缩写，可以配合title进行使用
9. bdo -> 更改文本方向，配合dir属性
10. var -> 标记一些变量，配合code进行使用
11. small -> 附属的相关细则
12. b -> 摘要中的关键字
13. i -> 本意是人物的思想活动等，目前用于图标比较多
14. u -> 与正常文本内容有反差的文本，例如错的单词，不合适的描述等
15. q -> 短引用
16. blockquote -> 长引用（块级）
17. address -> 地址信息（块级）

## 图片标签
1. src 图片的路径
2. alt 图片的描述
3. width 图片的宽度
4. height 图片的高度

## 绝对路径与相对路径
1. ./ 同级
2. / 下一级
3. ../ 上一级
4. 本地绝对路径：E:/../../..
5. 网络绝对路径：http://www.baidu.com/index.html

## 常见的图片格式
1. jpg/jpeg：不支持透明背景图片，不支持动态图
   - 支持的颜色丰富，占用空间小
   - 对图片细节没有极高的要求的场景
2. png：无损的压缩格式，保存高质量的图片
   - 支持的颜色丰富
   - 支持透明背景
   - 不支持动态图
   - 适用于高质量呈现图片与透明背景的场景
3. bmp：不进行压缩的一种格式
   - 支持颜色丰富、保留的细节更多
   - 对图片细节要求极高的场景
   - 不支持透明背景
   - 不支持动态图
4. gif：就你那支持256种颜色，色彩呈现并不完整
   - 支持颜色稍，支持简单的透明背景，支持动态图
   - 用于网页中的动态图片
5. webp：专用于呈现网页的图片
   - 具备以上几种的优点，但是兼容性一般。有动态图
   - 网页中的各种图片
6. base64: 一串特殊的文本，要通过浏览器打开，传统看图应用通常无法打开
   - 把图片进行base64编码，形成一串文本
   - 使用img的src即可
   - 使用比较小的，或者和网页一起加载的图片

## 超链接
1. 主要作用：从当前页面进行跳转
2. href:需要跳转到的链接
3. target: 
   - 在本页签进行打开 _self
   - 在新页签进行打开 _blank
4. 虽然是行内元素，但是可以包裹除他自身外的任何元素
### 跳转到锚点
1. 具有href a标签是超链接，具有name属性的a标签是锚点
2. name和id都是区分大小写，且id最好别是数字开头
### 唤起指定应用
在href内输入
1. tel:10086 -> 电话
2. sms:10086 -> 短信
3. mailto:10086@qq.com -> 邮件

## 列表
### 有序列表ol（Ordered List）
### 无序列表ul（Unordered List）
### 自定义列表dl（Define List）
### 注意事项
1. 列表标签不能嵌套，但是li标签可以嵌套
2. li标签最好不要单独使用
3. 列表标签内可以嵌套列表
4. 自定义列表一个dt可以跟很多个dd

## 表格
1. 表格`<table>`
2. 表格标题`<caption>`
3. 表格头部`<thead>`
4. 表格主体`<tbody>`
5. 表格脚注`<tfoot>`
6. 行 `<tr>`
7. 表格头部的单元格`<th>`
8. 表格主体的单元格`<td>`-> tdata
9. 跨行与跨列
   - rowspan：指定要跨的行数
   - colspan：指定要跨的列数

## 常用标签补充
1. br：换行
2. hr：分割
3. pre：按原文显示

## 表单的基本结构
1. 简单梳理
   - form -> 表单(action用于指定表单的提交地址 target用于控制表单提交后如何打开页面_self是本页打开，_blank是新页签打开)、method(用于控制表单提交的方式)
   - input(type 输入框的类型，目前使用的是text，表示文本类型 name 用于指定提交数据的名字)

## 表单的常用控件
1. 文本输入框
   - type = text
   - name属性：数据的名称
   - value属性：输入框的默认输入值
   - maxlength：输入框最大可输入长度
2. 密码输入框
   - type = password
3. 单选框
   - type = radio
4. 复选框
   - type = checkbox
5. 隐藏域
   - type = hidden
6. 提交
   - type = submit
7. 重置
   - type = reset
8. 普通按钮
   - type = button
9. 文本域
   - textarea
10. 下拉框
   - select
   - option

## 表单的禁用
- disabled

## 表单的label标签
1. label标签可以实现表单控件相关联，关联之后点击文字，与只对应的表单控会获取焦点  
两种与label关联的方式如下：
- 让label标签的for属性等于表单控件的id
- 把表单控件嵌套在label标签里面

## 框架标签
1. iframe 框架
   - name 框架名字
   - width 框架的宽
   - height 框架的高度
   - frame border 是否显示边框

## 字符实体
常见的字符实体
- 空格 -> &amp;nbsp;
- 小于号 -> &amp;lt;
- 大于号 -> &amp;gt;
- &和号 -> &amp;amp;
- 元 -> &amp;yen;
- 版权 -> &amp;copy;
- 乘号 -> &amp;times;
- 除号 -> &amp;divide;

## HTML全局属性
1. id 给标签指定唯一的标识，id是不可以重复的
   - 可以让label标签与表单控件关联
   - 不能再head、html、meta、script、style、title中进行使用
2. class 给标签指定类名
3. style 给标签指定样式
4. dir ltr与rtl 指定内容的方向
5. title 给标签设置一个文字提示，一般是图片与超链接使用的比较多
6. lang 给标签指定语言

## meta元信息
1. 配置字符编码
`<meta charset="utf-8">`
2. 针对IE浏览器的兼容性配置
`<meta http-equiv="X-UA-Compatible" content="IE=edge">`
3. 针对移动端的配置
`<meta name=viewport content="width=device-width, initial-scale=1.0">`
4. 配置网页关键字
`<meta name="keywords content="12341234"`
5. 配置网页描述信息
`<meta name=description content="2142134">`
6. 针对搜索引擎爬虫配置
`<meta name=robots content="2142134">`
7. 配置网页作者
`<meta name="author" contetn="shccc">`
8. 配置网页生成工具
`<meta name="generator" content="visual studio code">`
9. 配置定义网页版权信息
`<meta name="copyright" content="2023-2027版权所有">`
10. 配置网页自动刷新
`<meta http-equiv="refresh" content="10;url=http://www.baidu.com">`
