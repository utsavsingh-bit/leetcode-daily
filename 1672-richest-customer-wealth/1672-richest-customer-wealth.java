class Solution {
    public int maximumWealth(int[][] accounts) {
       int totalwealth=0;
        for(int i=0;i<accounts.length;i++){
             int wealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                wealth += accounts[i][j];
            }
            totalwealth = Math.max(wealth,totalwealth);
        }
        return totalwealth;
    }
}