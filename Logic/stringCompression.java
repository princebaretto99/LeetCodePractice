class Solution {
    //https://leetcode.com/problems/string-compression/
    public int compress(char[] chars) {
        
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < chars.length){
            j = i;
            while(j < chars.length && chars[i] == chars[j]){
                j++;
            }
            
            if( j-i == 1){
                chars[index++] = chars[i];
            }
            else{
                String counter = j-i + "";
                chars[index++] = chars[i];
                for(char c: counter.toCharArray()){
                    chars[index++] = c;
                } 
            }
            i = j; 
        }
        return index;
        
    }
}