package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wz
 * @date: 2022/10/22
 * Buddha Bless, No Bug !
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 */
public class LeetCode_3 {
    public static void main(String[] args) {
        String s = "pwwkesdfhsfdghdfghdrftghw";
        System.out.println(a(s));
    }

    // 遍历每个字符，然后出现重复字符停止，然后与记录中最长的字符比较长度，返回最长的长度
    public static String a(String s) {
        String maxLength = "";
        for (int i = 0; i < s.length(); i++) {
            StringBuilder nowLength = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                String c = String.valueOf( s.charAt(j));
                if (!nowLength.toString().contains(c)) {
                    nowLength.append(c);
                } else {
                    maxLength = nowLength.length() > maxLength.length() ? nowLength.toString() : maxLength;
                    break;
                }
            }
        }
        return maxLength;
    }
}
