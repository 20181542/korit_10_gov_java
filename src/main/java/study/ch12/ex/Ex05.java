package study.ch12.ex;

class Printer {

    public void print() {
        System.out.println("흑백 출력중...");
    }
}

class ColorPrinter extends Printer {

    public void print() {
        super.print();
        System.out.println("컬러 변환 완료");
    }
}

public class Ex05 {
    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        cp.print();
    }
}
