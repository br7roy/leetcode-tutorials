class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self) -> str:
        return 'val:%s,next:%s' % (self.val, self.next)


def mergeTwoLists1(l1, l2):
    dummy = cur = ListNode(0)
    while l1 and l2:
        if l1.val < l2.val:
            cur.next = l1
            l1 = l1.next
        else:
            cur.next = l2
            l2 = l2.next
        cur = cur.next
    cur.next = l1 or l2
    return dummy.next


if __name__ == '__main__':
    a = ListNode(1)
    b = ListNode(3)
    c = ListNode(5)
    d = ListNode(7)
    e = ListNode(9)
    a.next = b
    b.next = c
    c.next = d
    d.next = e

    j1 = ListNode(2)
    j2 = ListNode(4)
    j3 = ListNode(6)
    j4 = ListNode(8)
    j5 = ListNode(10)
    j1.next = j2
    j2.next = j3
    j3.next = j4
    j4.next = j5
    res = mergeTwoLists1(a, j4)
    print(res)
