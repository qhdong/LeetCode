# -*- coding: utf-8 -*-

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def swapPairs(self, head):
        if head and head.next:
            next, temp = head.next, head.next.next
            next.next = head
            head.next = self.swapPairs(temp)
            return next
        return head