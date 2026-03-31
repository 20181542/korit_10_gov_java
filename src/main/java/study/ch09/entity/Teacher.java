package study.ch09.entity;

public class Teacher {
    private String name;
    private int age;
    private int 월급;

    public Teacher() {}
    // 메모리적 관점
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.월급 = 100000;
    }

    public void printInfo() {
        System.out.println("선생님이름: " + name);
        System.out.println("선생님나이: " + age);
    }
    private void  월급계산(int 세전월급) {
       this.월급 = (int) (세전월급 - 세전월급 * 0.1);
    }
    //private 데이터은닉
}
