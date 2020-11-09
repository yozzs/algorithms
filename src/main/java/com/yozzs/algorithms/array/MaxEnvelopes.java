package com.yozzs.algorithms.array;

import java.util.Arrays;

/**
 * @Author: liuys23
 * @Date: 2020/10/25
 * 354. 俄罗斯套娃信封问题
 */
public class MaxEnvelopes {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0){
            return 0;
        }
        Arrays.sort(envelopes, (o1, o2) -> {
            if (o1[0] == o2[0]){
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        int res = 0;
        int length = 0;
        for (int i = 1; i < envelopes.length; i++) {
            if(envelopes[i][1] < envelopes[i - 1][1]){
                res = Math.max(length, res);
                length = 0;
            }
            length++;
        }
        return res;
    }
}
