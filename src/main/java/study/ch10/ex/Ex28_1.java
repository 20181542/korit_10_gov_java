package study.ch10.ex;

import java.util.Arrays;

public class Ex28_1 {
    public static void main(String[] args) {
        int[][] nums = {{10,20,30,31},{40,50,60,61},{70,80,90,91}};
        int[] colSums = new int[nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                colSums[j] += nums[i][j];

            }
        }
        System.out.println(Arrays.toString(colSums));
    }
}
