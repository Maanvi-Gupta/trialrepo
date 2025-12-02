import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        Student st = new Student();
        st1.name = sc.nextLine();
        st1.age = 22;
        st1.info(st1.name, st1.age);
        st1.info(st1.age);

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
