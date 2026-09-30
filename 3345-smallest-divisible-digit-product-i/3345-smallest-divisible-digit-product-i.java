class Solution {
    public int smallestNumber(int n, int t) {
       int count =n;
        while(true){
             int product =1;
             int temp = count;
        while(temp>0){
            int num = temp%10;
            product *= num ;
            temp /= 10;
        }
        if(product%t==0){
            return count;
        }
        count++;
        }
    }
}