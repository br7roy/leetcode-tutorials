import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 */
class Solution {

    public static void sort(int[] arr) {

        int h = 4;

        for (int j = 0; j > h - 1; j = j - h) {
            if (arr[j] < arr[j - h]) {
                swap(arr, j, j - h);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 3, 0, 7, 9, 8, 5 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
