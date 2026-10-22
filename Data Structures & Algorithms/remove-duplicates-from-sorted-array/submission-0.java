class Solution {
    public int removeDuplicates(int[] nums) {
     //i think this can be solved with 2 pointers approach
        // repeat this process until left>right
            //one left pointer one right pointer 
            //compare left ptr with +1 index element
            // if duplicate replace it with right pointer element.
        int i = 0;
        for(int j = 0;j <nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
    return i+1;

    
    }
    }