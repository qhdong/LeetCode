# -*- coding: utf-8 -*-
class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        seen = sum(([(c, i), (j, c), (i//3, j//3, c)]
                   for i, row in enumerate(board)
                   for j, c in enumerate(row)
                   if c != '.'), [])
        return len(seen) == len(set(seen))


if __name__ == '__main__':
    board = [".87654321","2........","3........","4........","5........","6........","7........","8........","9........"]
    s = Solution()
    s.isValidSudoku(board)