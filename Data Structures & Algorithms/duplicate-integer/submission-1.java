class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        if(nums.length <= 1)    return false;

        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            set.add(n);
        }

        return nums.length != set.size();
    }
}