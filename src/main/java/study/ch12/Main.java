package study.ch12;

abstract class AA {

}

class BB extends AA {

}

class CC extends BB{

}

class MM {
    public static void main(String[] args) {
        // AA a = new AA();  // 추상클래스라서 생성 불가
        BB b = new BB();
        AA b2 = new BB();
        AA c = new AA() {

        };

        AA cc = new CC();
        AA ccc = new BB() {

        };

    }
}



public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat cat =new Cat();
    }
}
