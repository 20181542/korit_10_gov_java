package study.ch19.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(List.of(5, 2, 8));
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(3, 9, 1));
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums1);
        nums3.addAll(nums2);

        Collections.sort(nums3);

        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println(nums3);


    }
}
