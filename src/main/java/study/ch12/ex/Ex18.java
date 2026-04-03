package study.ch12.ex;

interface Sortable {

     public void sort();

    public void printResult();
}

class NumberSorter implements Sortable {
    int[] number;

    public NumberSorter(int[] number) {
        this.number = number;
    }

    @Override
    public void sort() {

    }

    @Override
    public void printResult() {

    }
}



class StringSorter implements Sortable {
    String string;

    public StringSorter(String string) {
        this.string = string;
    }

    @Override
    public void printResult() {
        System.out.println(string);
    }

    @Override
    public void sort() {

    }
}

public class Ex18 {
    public static void main(String[] args) {
        int[] nums ={5, 9, 2, 7, 1};
        System.out.println(nums.length);

        for (int i = 0; i < nums.length - 1; i++) {
            int c = 0;
            if(nums[i] < nums[i] + 1) {
                c = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = c;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        System.out.println(nums.length);


    }
}

