
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        Student stu1 = new Student();
        stu1.name = sc.nextLine();
        stu1.age = 22;
        stu1.info(stu1.name, stu1.age);
        stu1.info(stu1.age);

    }

}

class Student {

    String name;
    int age;

    public void info(String name) {
        System.out.println(name);

    }

    public void info(int age) {
        System.out.println(age);
    }

    public void info(String name, int age) {
        System.out.println(name + "\n" + age);
    }

}
