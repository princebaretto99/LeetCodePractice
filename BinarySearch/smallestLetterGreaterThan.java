class Solution {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static int binarySearch(char[] arr, int target){
        int start = 0;
		int end = arr.length-1;
        int N = arr.length;
		
		while(start <=  end){
		    int mid = start + (end-start) / 2;
		    
		    if(arr[mid] > target){
		        end = mid-1;
		    }
		    else{
		        start = mid + 1;
		    }
		}
		return start % N;
    }
    
    public char nextGreatestLetter(char[] letters, char target) {
        return letters[binarySearch(letters,target)];
    }
}