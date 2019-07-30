#
# @lc app=leetcode.cn id=21 lang=python3
#
# [21] 合并两个有序链表
#
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode):
        curr = ListNode(0)
        dummy = curr
        while not l1 and not l2:
            if l1.val < l2.val:
                curr.next = ListNode(l1.val)
                l1 = l1.next
                curr = curr.next
            else:
                curr.next = ListNode(l2.val)
                l2 = l2.next
                curr = curr.next

        while l1:
            curr.next = ListNode(l1.val)
            l1 = l1.next
            curr = curr.next
        else:
            curr.next = ListNode(l2.val)
            l2 = l2.next
            curr = curr.next

        return dummy.next


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
