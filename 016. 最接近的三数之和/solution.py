class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        distance = float('inf')
        result = 0
        nums.sort()
        for i in range(len(nums)):
            left = i + 1
            right = len(nums) - 1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]

                tempDis = abs(sum - target)
                if tempDis < distance:
                    distance = tempDis
                    result = sum
                if tempDis == 0:
                    return sum
                elif sum - target > 0:
                    right -= 1
                else:
                    left += 1
        return result

if __name__ == '__main__':
    nums = [0,2,1,-3]
    target = 1
    solution = Solution()
    print(solution.threeSumClosest(nums, target))
