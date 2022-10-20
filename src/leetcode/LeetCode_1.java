package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wz
 * @date: 2022/10/20
 * Buddha Bless, No Bug !
 * 力扣第一题
 */
public class LeetCode_1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 11};
        int arg = 18;
        //int[] ret = a(arr, arg);
        int[] ret = a(arr, arg);
        for (int a : ret) {
            System.out.println(a);
        }
    }

    // for循环暴力破解法时间复杂度O(n*n)
    public static int[] a(int[] arr, int arg) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arg - arr[i] == arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // 利用map集合存储值，以空间换时间
    public static int[] b(int[] arr, int arg) {
        // key放数值，value放下标
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int a = arg - arr[i];
            if (map.containsKey(a)) {
                return new int[]{map.get(arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}
