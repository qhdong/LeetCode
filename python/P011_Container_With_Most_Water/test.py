import unittest

from P011_Container_With_Most_Water.ContainerWithMostWater import Solution


class TestCase(unittest.TestCase):
    def test_ok(self):
        self.assertEqual(4, Solution.maxArea([1, 2, 3, 4]))


if __name__ == '__main__':
    unittest.main()
