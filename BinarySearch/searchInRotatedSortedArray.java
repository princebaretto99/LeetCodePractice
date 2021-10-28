class Solution {
    //https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static int binarySearch(int[] arr, int start, int end, int target){
        
        while(start <= end){
            int mid = start + (end-start) / 2;
            
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        
        return -1;
    } 
    
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;  
        
        while(start <= end){
            int mid = start + (end-start) / 2;
            
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else if(arr[start] < arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        int leftStart = nums[0];
        
        if(pivot == -1) return binarySearch(nums, 0, nums.length-1, target);
        
        if(target == nums[pivot]){
            return pivot;
        }
        if(target >= leftStart) return binarySearch(nums, 0, pivot - 1, target);
        else return binarySearch(nums, pivot+1, nums.length-1, target);
        
    }
}