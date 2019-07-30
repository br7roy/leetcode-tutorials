import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
   /*  public int reverse(int x) {
        if (x > Integer.MAX_VALUE - 1 || x < Integer.MIN_VALUE) {
            return 0;
        }
        String str = String.valueOf(x);
        char[] cs = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean flg = false;
        if (cs[0] != '-') {
            for (int i = cs.length - 1; i >= 0; i--) {
                sb.append(cs[i]);
            }
        } else {
            flg = true;
            for (int i = cs.length-1; i > 0; i--) {
                sb.append(cs[i]);
            }
        }
        String a = flg ? '-' + sb.toString() : sb.toString();
        if (Long.valueOf(a) > Integer.MAX_VALUE  || Long.valueOf(a)< Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.valueOf(a);
    } */

    int reverse(int x){
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
            return (int) r;
        else
            return 0;
    }
public static void main(String[] args) {
    // int a = Integer.valueOf(9646324351);

        int r = 987;
        int res = r & 0x1;
        System.out.println(res);

}


}
