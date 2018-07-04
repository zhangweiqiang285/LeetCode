class Solution:
    def twoSum(self, nums, target):

        # 超时
        # 时间复杂度 O(n^2)
        # 空间复杂度 O(1)
        # for i in enumerate(self.nums):
        #     for j in enumerate(self.nums):
        #         if i[0] != j[0] and i[1] + j[1] == target:
        #                 return [i[0], j[0]]

        # 和上面一样超时
        # 时间复杂度 O(n^2)
        # 空间复杂度 O(1)
        # for i in range(len(self.nums)):
        #     for j in range(len(self.nums)):
        #         if i != j and self.nums[i] + self.nums[j] == target:
        #             return [i,j]

        # 遍历
        # 时间复杂度 O(n)
        # 空间复杂度 O(1)
        for i, v1 in enumerate(nums):
            v2 = target - v1
            if v2 in nums[i+1:]:
                j = nums.index(v2, i+1)
                return [i, j]

        # 两遍哈希表
        # 时间复杂度 O(n)
        # 空间复杂度 O(1)
        dict = { }
        for i in range(len(nums)):
            dict.update({nums[i]:i})
        for j in range(len(nums)):
            if target - nums[j] in dict and j != dict[target-nums[j]]:
                i = dict[target - nums[j]]
                return [j, i]

        # 一遍哈希表
        # 时间复杂度 O(n)
        # 空间复杂度 O(1)
        dict = { }
        for i, v1 in enumerate(nums):
            v2 = target - v1
            if v2 in dict:
                return [dict[v2],i]
            dict[v1] = i


if __name__ == '__main__':
    list = [3, 3]
    target = 6
    solution = Solution()
    solution.twoSum(list,target)
    print(solution.twoSum(list,target))