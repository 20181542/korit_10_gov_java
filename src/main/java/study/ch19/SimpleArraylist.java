package study.ch19;


import lombok.Getter;

import java.util.Arrays;

public class SimpleArraylist {
    @Getter
    private String[] strs = new String [0];

    public void add (){
        strs = new String[0];
    }

    public void add(String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;
        this.strs = newStrs;
    }
    public void pop() {
        String[] deStrs = new String[strs.length - 1];
        for (int i = 0; i < strs.length - 1; i++) {
            deStrs[i] = strs[i];
        }
        this.strs = deStrs;
    }
    // 크기를 넘어서는 인덱스 위치에 추가는 불가능
    public void add(int index, String str) {
        if (strs.length < 1) {
            return;
        }
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            int currentIndex = i < index ? i : i+1;
            newStrs[currentIndex] = strs[i];
            }
        newStrs[index] = str;
        strs = newStrs;
    }
    public void remove(int index) {
        if (strs.length < 1) {
            return;
        }
        String[] newStrs = new String[strs.length - 1];
        for (int i = 0; i < newStrs.length; i ++) {
            int deIndex = i < index ? i : i + 1;
            newStrs[i] = strs[deIndex];
        }
        strs = newStrs;
    }

    public void remove(String str) {
        int index = -1;
        String[] newStrs = new String[strs.length -1];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        remove(index);
    }
}


class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArraylist list = new SimpleArraylist();
        list.add("김준일");
        list.add("김준이");
        list.add("김준삼");
        list.add("김준사");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove(1);
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove("김준일");
        System.out.println(Arrays.toString(list.getStrs()));
    }
}