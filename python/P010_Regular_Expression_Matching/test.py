import unittest

from P010_Regular_Expression_Matching.Regular_Expression_Matching import Solution


class TestCase(unittest.TestCase):
    def test_ok(self):
        self.assertFalse(Solution.isMatch('aa', 'a'))
        self.assertTrue(Solution.isMatch('aa', 'aa'))
        self.assertFalse(Solution.isMatch('aaa', 'aa'))
        self.assertTrue(Solution.isMatch('aa', 'a*'))
        self.assertTrue(Solution.isMatch('aa', '.*'))
        self.assertTrue(Solution.isMatch('ab', '.*'))
        self.assertTrue(Solution.isMatch('aab', 'c*a*b'))

if __name__ == '__main__':
    unittest.main()