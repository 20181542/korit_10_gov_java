package study.ch02;

public class Main {
    public static void main(String[] args) {
        //세미콜론 까지 하나의 명령
        String name =
                "석우림";
        char name3 ='석';
        System.out.println(name);
        // 주석: 소스코드 중간중간 메모를 남길 때 사용(프로그램 실행시 영향을 주지 않음)
        // 컨트롤 /
        // 컨트롤 시프트 /
        String name2 =/* "석" + "우" + */"림" + 2;
        System.out.println(name2);
        // \n = 줄 바꿈, \t = 들여쓰기 (이스케이프 문자)
        System.out.print("석\n");
        System.out.print("석\t");
        System.out.print("우");
        System.out.print("림");
    }
}
