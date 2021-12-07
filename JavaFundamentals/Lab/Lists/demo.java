package ListLab;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        nums.remove(2);
        nums.remove(Integer.valueOf(40));
        nums.add(100);
        nums.add(100);
        nums.add(0, -100);
        nums.set(0, 1);
        int indexOf = nums.indexOf(100);
        System.out.println(nums);
        System.out.println(indexOf);

    }
}

