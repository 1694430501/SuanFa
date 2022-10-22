package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wz
 * @date: 2022/10/20
 * Buddha Bless, No Bug !
 * 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 现有矩阵 matrix 如下：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 * 限制：
 * 0 <= n <= 1000
 * 0 <= m <= 1000
 */
public class Offer_04 {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        long start = System.currentTimeMillis();
        System.out.println(start);
        //System.out.println(a(arr, target));// 0
        System.out.println(b(arr, target));// 0
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }

    // 利用map集合的containsKey()方法
    public static boolean a(int[][] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                map.put(arr[i][j], i + j);
            }
        }
        return map.containsKey(target);
    }

    // 从矩阵右上角或者左下角开始（左上角比所有的数字都小，右下角比所有的数字都大，所以不选他们作为起始点），target比现在的数字小就往上，大就往右
   public static boolean b(int[][] arr, int target) {
        int i = 4, j = 0;
        while (i>0 && j<arr.length) {
            if (arr[i][j] == target) {
                return true;
            }
            if(arr[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}
