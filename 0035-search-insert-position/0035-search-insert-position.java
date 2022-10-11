
class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int sh=nums.length;
        while(s<sh)
        {
            int mid=s+(sh-s)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<=target)
                s=mid+1;
            else
                sh=mid;
        }
        return sh;
    }
}