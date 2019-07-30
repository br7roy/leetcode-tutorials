/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */
class Solution {
    public  String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int sIndex= 0;
        int len = 0 ;
        for (int i = 0; i < strs.length;i++) {
            String currentStr = strs[i];
            int currLen = currentStr.length();
            if(currLen<len){
                sIndex=i;
                len = currLen;
            }
        }
        String sStr = strs[sIndex];
        for (int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(sStr)!=0){
                sStr = sStr.substring(0, sStr.length()-1);
            }
        }
        return sStr;
    }
    
}

