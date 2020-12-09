package com.ellen.androidcomputerproblem.answer;

public class Sort {

    /**
     * 冒泡排序
     *
     * @param target 待排序的数组
     * @param isDes  是否降序
     * @return
     */
    public static int[] bubbleSort(int[] target, boolean isDes) {
        if (target.length <= 1) return target;
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if (isDes) {
                    if (target[i] > target[j]) {
                        int temp = target[i];
                        target[i] = target[j];
                        target[j] = temp;
                    }
                } else {
                    if (target[i] < target[j]) {
                        int temp = target[i];
                        target[i] = target[j];
                        target[j] = temp;
                    }
                }
            }
        }
        return target;
    }

    /**
     * 选择排序
     *
     * @param target 待排序的数组
     * @param isDes  是否降序
     * @return
     */
    public static int[] selectSort(int[] target, boolean isDes) {
        if (target.length <= 1) return target;
        for (int i = 0; i < target.length; i++) {
            int tempIndex = i;
            for (int j = tempIndex + 1; j < target.length; j++) {
                if (isDes) {
                    //降序
                    if (target[j] > target[tempIndex]) {
                        tempIndex = j;
                    }
                } else {
                    //升序
                    if (target[j] < target[tempIndex]) {
                        tempIndex = j;
                    }
                }
            }

            //进行交换
            if (i != tempIndex) {
                int temp = target[i];
                target[i] = target[tempIndex];
                target[tempIndex] = temp;
            }
        }

        return target;
    }

    /**
     * 插入排序
     *
     * @param target 待排序的数组
     * @param isDes  是否降序
     * @return
     */
    public static int[] insertSort(int[] target, boolean isDes) {
        if (target.length <= 1) return target;
        for (int i = 1; i < target.length; i++) {
            for (int j = i; j > 0; j--) {
                if (isDes) {
                    //降序
                    if(target[j] > target[j-1]){
                        int temp = target[j];
                        target[j] = target[j-1];
                        target[j-1] = temp;
                    }
                } else {
                    //升序
                    if(target[j] < target[j-1]){
                        int temp = target[j];
                        target[j] = target[j-1];
                        target[j-1] = temp;
                    }
                }
            }
        }
        return target;
    }

}