public class Person {
    private String name; // 名称
    private int age; // 年龄

    public void setName(String name) {
        // this来访问当前的实例，可以解决一些冲突的场景
        this.name = name;
    }


    // 方法的重载
    public void hello() {
        System.out.println("hello");
    }

    public void hello (String name) {
        System.out.println("hello " + name);
    }

    public void hello (String name, int age) {
        System.out.println("hello " + name + ", your age is " + age);
    }
}

class Student extends Person {
    private int score;
}
