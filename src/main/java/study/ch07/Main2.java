package study.ch07;

public class Main2 {
    public static void main(String[] args) {

//        for (초기식(선처리); 조건식; 증감식(후처리)) ;
//        if (조건식) ;

//        int num = 10;
//        int count = 0;
//        int count2 = 0;
//        for (;num % 2 == 0; num = count++ == 3 ? 1 : 10, count2++) System.out.println("짝수 입니다.");
        //지역 변수
        for (int num = 10, count = 0, count2 = 0; num % 2 == 0; num = count++ == 3 ? 1 : 10, count2++) System.out.println("짝수 입니다.");






    }
}
