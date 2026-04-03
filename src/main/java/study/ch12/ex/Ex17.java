package study.ch12.ex;

interface Printable {
    public void  print();
}

interface Scannable {
    public void scan();
}

interface Faxable {
    public void fax();
}

class AllInOnePrinter implements Printable, Scannable, Faxable {

    @Override
    public void fax() {
        System.out.println("fax");
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void scan() {
        System.out.println("scan");
    }
}

public class Ex17 {
    public static void main(String[] args) {
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print();
        allInOnePrinter.scan();
        allInOnePrinter.fax();
    }
}
