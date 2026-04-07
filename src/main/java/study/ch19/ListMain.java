package study.ch19;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        //값 추가
        numList.add(100);

        //해당 인덱스 위치에 추가
        numList.add(0,200);

        //값 조회
        Integer n1 = numList.get(1);
        System.out.println(n1);

        //여러 값 한번에 추가
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(1000);
        numList2.add(2000);
        numList2.add(3000);

        numList.addAll(numList2);
        System.out.println(numList);
        numList.addAll(1, numList2);
        System.out.println(numList);

        //찾는 값이 있으면 true 없으면 false
        boolean hasFound = numList.contains(4000);
        System.out.println(hasFound);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        System.out.println("----------------");

        for (Integer num : numList) {
            System.out.println(num);
        }

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        System.out.println(strList);

        List<String> strList2 = new LinkedList<>();
        strList2.add("a");
        strList2.add("b");
        strList2.add("c");
        strList2.add("d");
        System.out.println(strList2);

        //List.of 고정(추가수정 불가능)
        List<String> imStrList = List.of("a", "b", "c", "d");
        //imStrList.add("e");
        System.out.println(imStrList);

        List<String> nonImStrList = new ArrayList<>();
        nonImStrList.addAll(imStrList);
        nonImStrList.add("e");
        System.out.println(nonImStrList);

        List<String> nonImStrList2 = new ArrayList<>(List.of("a", "b", "c"));

    }
}
