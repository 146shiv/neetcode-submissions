class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;

        // int min = Integer.MAX_VALUE;
        

        // for(int i = 0; i<n; i++){

        //     if(nums[i] < min){
        //         min = nums[i];
        //     }
        // }
        // return min;

        int left = 0;
        int right = n-1;

        while(left<right){

            int mid = left + (right - left)/2;

            if(nums[mid] > nums[right]){
                left=mid+1;
            }else if(nums[mid] <=nums[right]){
                right = mid;
            }

        }
        return nums[left];
    }
}
