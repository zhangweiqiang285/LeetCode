class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # 全部遍历 超时
        # 时间复杂度 O(n^3)
        # 空间复杂度 O(1)
        """
        dict1 = { }
        for i, v1 in enumerate(nums):
            dict1[i] = v1
        answer = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i < j:
                    for k, value in dict1.items():
                        if value == -(dict1[i] + dict1[j]):
                            if k != i and k != j and j < k:
                                temp = [dict1[i], dict1[j], dict1[k]]
                                temp.sort()
                                answer.append(temp)
        answer_set = set(tuple(x) for x in answer)
        answer = [list(x) for x in answer_set]
        return answer
        """
        answer = []
        nums.sort()
        for i in range(len(nums)):

            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = len(nums) - 1
            while left < right:
                if nums[i] + nums[left] + nums[right] == 0:
                    temp = [nums[i], nums[left], nums[right]]
                    answer.append(temp)
                    left += 1
                    right -= 1

                    while left < right and nums[left] == nums[left - 1]:  # skip duplicates
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

                elif nums[i] + nums[left] + nums[right] < 0:
                    left += 1
                else:
                    right -= 1

        #answer_set = set(tuple(x) for x in answer)
        #answer = [list(x) for x in answer_set]
        return answer



if __name__ == "__main__":
    solution = Solution()
    nums = [-1, 0, 1, 2, -1, -4]
    print(solution.threeSum(nums))
