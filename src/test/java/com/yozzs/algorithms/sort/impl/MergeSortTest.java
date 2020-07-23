package com.yozzs.algorithms.sort.impl;

import com.yozzs.algorithms.sort.Sort;
import com.yozzs.algorithms.sort.impl.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void doSort() {
        Sort sort = new MergeSort();
        int[] nums = new int[]{1,5,9,3,6,3,8,9,1,6,2,8};
        sort.sort(nums);
        sort.show(nums);
        Assertions.assertTrue(sort.isSorted(nums),"assert fault");
    }
}