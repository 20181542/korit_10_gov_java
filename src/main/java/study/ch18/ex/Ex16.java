package study.ch18.ex;

public class Ex16 {
    // 방식 A: Eager(즉시로딩)
    static class SingletonA {
        private static final SingletonA INSTANCE = new SingletonA();
        private SingletonA() { }
        public static SingletonA getInstance() { return INSTANCE; }
    }

    // 방식 B: Lazy(지연로딩)
    static class SingletonB {
        private static SingletonB instance;
        private SingletonB() { }
        public static SingletonB getInstance() {
            if (instance == null) instance = new SingletonB();
            return instance;
        }
    }
}
