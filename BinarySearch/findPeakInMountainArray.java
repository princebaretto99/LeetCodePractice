class Solution {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static int binarySearch(int[] arr){
       int start = 0;
       int end = arr.length-1;
        
       while(start != end){
           int mid = start + (end-start) / 2;
           
           if(arr[mid] > arr[mid+1]){
               end = mid;
           }
           else if (arr[mid] < arr[mid+1]){
               start = mid + 1;
           }
       }
        
       return start;
   }
   
   public int peakIndexInMountainArray(int[] arr) {
       return binarySearch(arr);
   }
}