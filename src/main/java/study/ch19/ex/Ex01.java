package study.ch19.ex;


import java.util.ArrayList;


public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(96);
        scores.add(88);
        System.out.println("전체 점수: " + scores);

        double a = 0;
        int max = 0;
        for (int b : scores){
            a += b;
            if (max < b) {
                max = b;
            }
        }
        a = a / scores.toArray().length;
        System.out.println("평균: " + a);
        System.out.println("최고 점수: " + max);


    }



}
