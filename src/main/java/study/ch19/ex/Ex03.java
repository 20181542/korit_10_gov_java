package study.ch19.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        ArrayList<Integer> nums2 = new ArrayList<>();

        for (int n : nums) {
            if ( n % 3 == 0) {
                nums2.add(n);
            }
        }
        Collections.reverse(nums2);
        System.out.println(nums2);

        List<Integer> nums1 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            nums1.add(i + 1);
        }

        for(int i = 0; i < 20; i++) {
            int num = nums1.get(i);
            if (num % 3 == 0) result.add(0, num);
        }

        System.out.println(result);
        System.out.println(nums1.get(0));




    }
}
