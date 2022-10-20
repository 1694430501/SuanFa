package JianZhiOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: wz
 * @date: 2022/10/20
 * Buddha Bless, No Bug !
 * 找出数组中重复的数字。
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 输入：[2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class Offer_03 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("start----" + start);
        int[] arr = {2, 3, 1, 0, 2, 5, 3, 2, 0, 3, 3, 3, 5};
        HashMap<Integer, Integer> m = a(arr);
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey());
        }
        long end = System.currentTimeMillis();
        System.out.println("end----" + end);
        System.out.println(end-start);
    }

    public static HashMap a(int[] arr) {
        HashMap map = new HashMap();
        Set set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                map.put(arr[i], i);
            }
        }
        return map;
    }
}
