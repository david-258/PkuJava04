public class Solution {
    public void rotate(int[] nums, int k) {
		int len = nums.length;
		k = k%len;
		int[] tempNums = Arrays.copyOf(nums,len);
		for(int i=0;i<len;i++){
		    if(i+k>=len){
		        nums[i+k-len] = tempNums[i];
		    }else{
		        nums[i+k] = tempNums[i];
		    }
		}
    }
}
