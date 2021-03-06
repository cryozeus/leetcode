class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0) return "";
        
        /*
        Imagine a very short string is the common prefix at the end of the array. 
        The above approach will still do SS comparisons. One way to optimize this case is to do vertical scanning. 
        We compare characters from top to bottom on the same column (same character index of the strings) 
        before moving on to the next column.
        */
        
        
        for(int i = 0; i < strs[0].length(); i++) {
            
            char c = strs[0].charAt(i);
            
            for(int j = 1; j < strs.length; j++) {
                
                if(i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0,i);
                }
                    
            }
        }
        return strs[0];
        
        
    }
}