class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ele = nums[0];
        
        for(int i = 0; i<nums.length;i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }else if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        //verification;
        int cout = 0;
        for(var val: nums){
            if(val == ele){
                cout++;
            }
        }
        if(cout>(nums.length/2)){
            return ele;
        }
    return -1;
    }

}