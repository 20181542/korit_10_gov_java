package ex2;

import ex2.router.RouterPath;
import ex2.router.Routes;

public class Ex2Application {
    /**
     *1.계좌생성 2.입금 3.출금 4.계좌조회 5.전체목록 6.거래내역 7.종료
     * 활용 개념: static(자동 채번), 사용자 정의 예외, Map, ArrayList, try-catch, 캡슐화
     *
     */
        public static boolean running = true;

        public static void main(String[] args) {
            System.out.println("프로그램 실행");
            while (running) {
                Routes.valueOf(RouterPath.current).getView().render();
            }
            System.out.println("프로그램 종료");
        }

    }

