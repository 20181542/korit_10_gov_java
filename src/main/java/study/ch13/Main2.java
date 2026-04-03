package study.ch13;

abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal() {}
    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// 단일 상속(class), 다중 구현(interface)
class Duck extends AbstractAnimal implements Flyable, Swimmable{

    public Duck() {
        super();
    }

    public  Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("수영");
    }

    @Override
    public void fly() {
        System.out.println("날다");

    }
}


public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();

        duck.fly();
        duck.swim();
        duck.setName("우리집 오리");
        System.out.println(duck.getName());

        animal.setName("옆집오리");
        System.out.println(animal.getName());

        flyable.fly();

        swimmable.swim();
    }
}
