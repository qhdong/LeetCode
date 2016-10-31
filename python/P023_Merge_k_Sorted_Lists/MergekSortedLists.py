class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

import heapq

class Solution(object):
    def mergeKLists(self, lists):
        if not lists:
            return None
        pq = [(node.val, node) for node in lists if node]
        heapq.heapify(pq)

        dummy = ListNode(0)
        tail = dummy
        while pq:
            _, node = heapq.heappop(pq)
            tail.next = node
            tail = tail.next
            if tail.next:
                heapq.heappush(pq, (tail.next.val, tail.next))
        return dummy.next