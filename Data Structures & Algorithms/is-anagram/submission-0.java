class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())    return false;

        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;

            char d = t.charAt(i);
            freq[d - 'a']--;
        }

        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
