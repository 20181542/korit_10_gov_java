package study.ch08;

public class OBJ04 {

    public static void main(String[] args) {
        class Addition {
            void add(int a) {}
            void add(double a){}
            void add(int a, double b){}
            void add(double a, int b){}
            int add(int a, int b, int c) {return a + b + c;}
            int add(int a, int b, int c, int d) {return a + b + c;}

        }

        Addition aaa = new Addition();

    }
}
