package com.ellen.androidcomputerproblem.answer;

/**
 * 查找算法
 */
public class Search {

    /**
     * 二分查找
     *
     * @param targetArray 待查的数组
     * @param searchValue 待查的值
     * @return 查找到的位置索引值，没有找到返回-1
     */
    public static int binarySearch(int[] targetArray, int searchValue) {
        //这里先判断数组是否有序
        if(!isSort(targetArray)){
            System.out.println("数组无序，无法进行二分查找!");
            return -1;
        }
        //这里判断是升序还是降序
        boolean isDes = true;
        if(targetArray[0] > targetArray[1]){
            isDes = true;
        }else {
            isDes = false;
        }

        int middle = -1;

        if(isDes) {
            int low = 0;
            int high = targetArray.length - 1;

            if (searchValue > targetArray[low] || searchValue < targetArray[high] || low > high) {
                return middle;
            }

            while (low <= high){
                middle = (low + high) / 2;
                if(targetArray[middle] > searchValue){
                    low = middle + 1;
                }else if(targetArray[middle] < searchValue){
                    high = middle - 1;
                }else {
                    return middle;
                }
            }


        }else {
            int low = 0;
            int high = targetArray.length - 1;

            //升序数组的二分查找
            if (searchValue < targetArray[low] || searchValue > targetArray[high] || low > high) {
                return middle;
            }

            while (low <= high) {
                middle = (low + high) / 2;
                if (targetArray[middle] > searchValue) {
                    high = middle - 1;
                } else if (targetArray[middle] < searchValue) {
                    low = middle + 1;
                } else {
                    return middle;
                }
            }
        }
        return middle;
    }

    /**
     * 判断数组是否有序
     * @return true:有序
     */
    private static boolean isSort(int[] array){
        boolean isDes;
        if(array[0] < array[1]){
            isDes = false;
        }else {
            isDes = true;
        }
        for(int i=0;i<array.length-1;i++){
            if(isDes){
                //降序
                if(array[i] < array[i+1]){
                    return false;
                }
            }else {
                //升序
                if(array[i] > array[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
