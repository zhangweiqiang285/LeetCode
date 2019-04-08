class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag = 0;
        for(int i = 0; i < nums.length; i++)
        {  
            if(nums[i] == target)
            {
                return i;
            }
            else
            {
                if(nums[i] < target)
                {
                    flag++;
                }
            }
        }
        return flag;
        
    }
}

public int searchInsert(int[] nums, int target) 
{
    for(int i = 0; i < nums.length;i++)
    {
        if(nums[i] >= target)
        {
            return i;
        }
    }
    return nums.length;
}