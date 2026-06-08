package study.ch28;

import java.util.Objects;

public record CustomerDto(int id, String name, String phone) {
    public CustomerDto {
        if(name == null || Objects.equals(name.trim(), "")) {
            throw new IllegalArgumentException("이름은 필수 입니다.");
        }
    }
    public void test() {
        System.out.println("테스트 출력");
//        name = "test";
    }

}
