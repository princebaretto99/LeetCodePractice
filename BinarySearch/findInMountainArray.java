/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static int binarySearchPeak(MountainArray arr){
       int start = 0;
       int end = arr.length()-1;
        
       while(start != end){
           int mid = start + (end-start) / 2;
           
           if(arr.get(mid) > arr.get(mid+1)){
               end = mid;
           }
           else if (arr.get(mid) < arr.get(mid+1)){
               start = mid + 1;
           }
       }
        
       return start;
   }
   
   public static int binarySearch(MountainArray arr, int target, int start, int end){
       
       while(start <= end){
           int mid = start + (end-start) / 2;
           
           if(arr.get(mid) > target){
               end = mid-1;
           }
           else if (arr.get(mid) < target){
               start = mid + 1;
           }
           else{
               return mid;
           }
       }
        
       return -1;
   }
   
   public static int reverseBinarySearch(MountainArray arr, int target, int start, int end){
       
       while(start <= end){
           int mid = start + (end-start) / 2;
           
           if(arr.get(mid) < target){
               end = mid-1;
           }
           else if (arr.get(mid) > target){
               start = mid + 1;
           }
           else{
               return mid;
           }
       }
        
       return -1;
   }
   
   public int findInMountainArray(int target, MountainArray mountainArr) {
       int peak = binarySearchPeak(mountainArr);
       int left = binarySearch(mountainArr, target, 0, peak);
       int right;
       if(left != -1) {
           return left;
       }
       return reverseBinarySearch(mountainArr, target, peak+1, mountainArr.length()-1);
   }
}