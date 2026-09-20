class Solution {
    public int reverseDegree(String s) {
        int product =1,sum=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int normalPosition = ch - 'a' + 1;
            int reversePosition = 27 - normalPosition;
            product = (i+1) * reversePosition;
            sum += product;
        }
        return sum;
    }
}