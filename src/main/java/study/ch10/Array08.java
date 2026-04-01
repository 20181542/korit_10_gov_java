package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = {"김준일", "김준이", "김준삼"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 10;
            System.out.println(nums[i]);
        }

        //단순 읽기 (조회)
        for(int num : nums) {
            num = num * 10;
        }
        // 인덱스를 바꾸지 않기 때문에 결과는 같다.
        for(int num : nums) {
            System.out.println(num);
        }


    }
}
