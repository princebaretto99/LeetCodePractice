class Solution {
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int toFind = target - nums[i];
            if(map.containsKey(toFind)){
                return new int[] {map.get(toFind), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[] {-1,-1};
    }
}