class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for(String s: strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            
            if(!map.containsKey(sorted))
                map.put(sorted, new ArrayList<>());

            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
