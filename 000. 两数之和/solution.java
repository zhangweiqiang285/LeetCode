class solution
{
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = 0; j < nums.length - 1; j++)
            {
                if((target == nums[i] + nums[j]) && (i != j))
                    return new int[]{i,j};
            }
        }
        return null;
    }
}