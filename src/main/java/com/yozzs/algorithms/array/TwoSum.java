package com.yozzs.algorithms.array;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: liuys23
 * @Date: 2020/8/4
 * 57. 输入一个递增排序的数组和一个数字s，在数组中查找两个数，
 * 使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * 双指针
 */
public class TwoSum {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = new Integer(100);
        Integer i3 = 100;
        Integer i4 = 200;
        Integer i5 = 200;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i3 == i2);
        System.out.println(i4 == i5);

        System.out.println(new Integer(100) == 100);
        System.out.println(new Integer(200) == 200);
        System.out.println(new String("11") == "11");
        /*TwoSum twoSum = new TwoSum();
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("please input arr:");
            String line = scanner.nextLine();
            String[] strs = line.split("\\s+");
            List<String> list = Arrays.asList(strs);

            int[] arr = list.stream().mapToInt(Integer::valueOf).toArray();

            System.out.println("please input taget:");
            int target = scanner.nextInt();

            System.out.println("result:\n" + Arrays.toString(twoSum.twoSum(arr, target)));
        }*/
    }

    public int[] twoSum(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (sum < target) {
                lo++;
            } else if (sum > target) {
                hi--;
            } else return new int[] {nums[lo], nums[hi]};
        }
        return new int[] {-1, - 1};
    }

    //非有序, hash表
    public int[] twoSum1(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return new int[]{map.get(i), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

}
