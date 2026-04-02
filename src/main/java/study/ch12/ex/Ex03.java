package study.ch12.ex;

class Parson {
    String name;

    public Parson(String name) {
        this.name = name;
    }

    public void pa() {
        System.out.println("생성자: " + name);
    }
}

class Student extends Parson {
    String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public void ma() {
        System.out.println("생성자: " + major);
    }
}

class GradStudent extends Student {
    String research;

    public GradStudent(String name, String major, String research) {
        super(name, major);
        this.research = research;
    }

    public void gr() {
        System.out.println("생성자: " + research);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        GradStudent a = new GradStudent("김자바", "컴퓨터공학과", "인공지능");
        a.pa();
        a.ma();
        a.gr();
    }
}
