public class MaximumDifferenceBetweenIncreasingElements2016 {

    public int maximumDifference(int[] nums) {
        int minVal=nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>minVal){
          diff=Math.max(diff,nums[i]-minVal);
            }
        
        
        else {
            minVal=nums[i];
        }
        }
         return diff;
    }
   
}

  

