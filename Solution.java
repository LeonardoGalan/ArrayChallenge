package com.company;

import java.util.Arrays;

class Solution {

    int [] nums = new int[]{5,6,8,4,2,7};

    //sortedSquares(nums);

    public int[] sortedSquares(int[] array) {
        return sort(nums);

    }


        public int [] sort(int[] sort){
            int[] kek = Arrays.copyOf(sort, sort.length);


            for(int i = 0;i<kek.length-1;i++){
                int temp = 0;
                if(kek[i]>kek[i+1])
                    temp = kek[i];
                kek[i] = kek[i+1];
                kek[i+1] = temp;
            }

            return kek;
        }

    }