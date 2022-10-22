package leetcode;

import java.util.Arrays;

/**
 * @author: wz
 * @date: 2022/10/21
 * Buddha Bless, No Bug !
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以0开头。
 * 00000000000000000
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 */
public class LeetCode_2 {
    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9, 9, 9, 9, 9};
        int[] arr2 = {9, 9, 9, 9};
        int length = Math.max(arr1.length, arr2.length);
        int[] arr3 = new int[length + 1];
        //a(arr1, arr2, length, arr3);
        System.out.println(arr3 = b(arr1, arr2, arr3));
        for (int a = 0; a < arr3.length; a++) {
            System.out.println(arr3[a]);
        }
    }

    private static void a(int[] arr1, int[] arr2, int length, int[] arr3) {

    }

    // 利用StringBuilder的方法倒序，然后相加（中间多次类型转换，麻烦）
    public static int[] b(int[] arr1, int[] arr2, int[] arr3) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int arr : arr1) {
            sb1.append(arr);
        }
        sb1 = sb1.reverse();
        for (int arr : arr2) {
            sb2.append(arr);
        }
        sb2 = sb2.reverse();
        sb3 = sb3.append(Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString())).reverse();
        String[] arr = sb3.toString().split("");
        arr3 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        return arr3;
    }
}
