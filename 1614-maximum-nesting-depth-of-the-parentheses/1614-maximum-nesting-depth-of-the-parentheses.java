class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxDepth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                maxDepth=Math.max(maxDepth,count);
            }
            else if(c==')'){
                count--;
            }
        }
        return maxDepth;
    }
}