class Solution {
    public long findhrs(int[]piles,int k){
        long hrs=0;
        for(int i=0;i<piles.length;i++){
            hrs+=(int)Math.ceil((double)piles[i]/k);
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int maxelement=0;
        
        for(int i=0;i<piles.length;i++){
            maxelement=Math.max(piles[i],maxelement);
        }
       
        
        int left=1;
        int right=maxelement;

        while(left<=right){

            int mid=left+(right-left)/2;

            long totalhrs=findhrs(piles,mid);
        
            if(totalhrs<=h){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left;
    }
}
    

    