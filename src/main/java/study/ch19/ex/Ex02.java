package study.ch19.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Java","Python","Java","C++","Python","Go"));
        ArrayList<String> unique = new ArrayList<>();
        System.out.println(new HashSet<>(list));

        for (int i = 0; i < list.size(); i++) {
            String lists = list.get(i);
            if(!unique.contains(lists)) {
                unique.add(lists);
            }
        }
        System.out.println(unique);








        for (String s : list) {
            if (!unique.contains(s)) unique.add(s);
        }
        System.out.println(unique); // [Java, Python, C++, Go]


    }
}
