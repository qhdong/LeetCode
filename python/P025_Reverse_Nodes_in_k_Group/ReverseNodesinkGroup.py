# -*- coding: utf-8 -*-

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def reverseKGroup(self, head, k):
        def reverse(first, last):
            prev = last
            while first != last:
                tmp = first.next
                first.next = prev
                prev, first = first, tmp
            return prev

        node = head
        for _ in range(k):
            if not node:
                # less than k, just leave the list as it is
                return head
            node = node.next
        new_head = reverse(head, node)
        head.next = self.reverseKGroup(node, k)
        return new_head