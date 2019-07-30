#
# @lc app=leetcode.cn id=88 lang=python
#
# [88] 合并两个有序数组
#
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        end = m+n-1
        l1 = m-1
        l2 = n-1
        while l1 >= 0 and l2 >= 0:
            if nums1[l1] > nums2[l2]:
                nums1[end] = nums1[l1]
                l1 -= 1
            else:
                nums1[end] = nums2[l2]
                l2 -= 1
            end -= 1
        if l1 < 0:
            nums1[:l2+1] = nums2[:l2+1]
        print( nums1)

if __name__ == '__main__':
    s=Solution()
    s.merge([0],0,[6],1)
    
