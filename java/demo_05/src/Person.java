public class Person {
    private String name; // 名称
    private int age; // 年龄

    public void setName(String name) {
        // this来访问当前的实例，可以解决一些冲突的场景
        this.name = name;
    }
}
