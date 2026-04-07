package study.ch19.ex;

import java.util.ArrayList;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> fru = new ArrayList<>();
        fru.add("사과");
        fru.add("바나나");
        fru.add("포도");
        fru.add("딸기");
        System.out.println("초기: " + fru);
        System.out.println("포도를 망고로 변경");

        int idx = fru.indexOf("포도");
        System.out.println(idx);
        fru.set(idx, "망고");
        fru.add(0, "체리");
        fru.remove("딸기");
        System.out.println(fru);
    }
}
