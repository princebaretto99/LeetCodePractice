class Solution {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static int binarySearch(int[] arr, int target, boolean findStart){
        int ans = -1;
        int start = 0;
		int end = arr.length-1;
        int N = arr.length;
		
		while(start <=  end){
		    int mid = start + (end-start) / 2;
		    
		    if(arr[mid] > target){
		        end = mid-1;
		    }
		    else if(arr[mid] < target) {
		        start = mid + 1;
		    }
            else {
                //Potential answer can be others too
                ans = mid;
                if (findStart) end = mid -1;
                else start = mid+1;
                
            }
		}
		return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        
        return new int[] {start, end};
    }
}