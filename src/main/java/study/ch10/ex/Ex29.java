package study.ch10.ex;

public class Ex29 {
    public static void main(String[] args) {
        int[][] nums =  {{3,7,1},{9,2,6},{4,8,5}};

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (num == 0) {
                    num = nums[i][j];
                }
                if (nums[i][j] > num) {
                    num = nums[i][j];
                }

            }
        }
        System.out.println("최대값: " + num);
    }
}
