class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        """
        # 超时
        # 时间复杂度 O(n^2)
        # 空间复杂度 O(1)
        maxArea = 0
        for i in range(len(height)):
            for j in range(len(height)):
                if i < j:
                    if height[i] >= height[j]:
                        area = (j - i) * height[j]
                    else:
                        area = (j - i) * height[i]
                    if area >= maxArea:
                        maxArea = area
        return maxArea
        """
        # 超时
        # 时间复杂度 O(n^2)
        # 空间复杂度 O(1)
        maxArea = 0
        left = 0
        right = len(height) - 1
        while right > left:
            if height[left] >= height[right]:
                area = (right - left) * height[right]
                right -= 1
            else:
                area = (right - left) * height[left]
                left += 1
            if area >= maxArea:
                maxArea = area
        return maxArea

if __name__ == '__main__':
    height = [2,3,4,5,18,17,6]
    solution = Solution()
    print(solution.maxArea(height))