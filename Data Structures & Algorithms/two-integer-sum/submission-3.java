class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ht=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ht.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(target-nums[i]) && ht.get(target-nums[i])!=i){
                return new int[]{i,ht.get(target-nums[i])};
            }
        }
        return new int[0];
    }
}
