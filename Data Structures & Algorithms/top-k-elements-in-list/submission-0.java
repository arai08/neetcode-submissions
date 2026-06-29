class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] ans = new int[k];
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(map.get(b), map.get(a));
            }
        });

        // list.sort((a, b) -> Integer.compare(map.get(b), map.get(a)));

        for(int i=0; i<k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
