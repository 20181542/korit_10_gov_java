package study.ch12.ex;

class Animal{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat () {
        System.out.println(name + "이(가) 밥을 먹는다");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }

    public void meow() {
        System.out.println("야옹!");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Dog d = new Dog("바둑이", "진돗개");
        d.eat();
        d.bark();

        Cat c = new Cat("나비", true);
        c.eat();
        c.meow();

    }
}
