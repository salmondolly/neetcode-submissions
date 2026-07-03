class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
//approach one was sorting array then comparing them 
        // char[] a1 = s.toCharArray();
        // char[] a2 = t.toCharArray();

        // Arrays.sort(a1);
        // Arrays.sort(a2);

        // if (Arrays.equals(a1, a2)) {
        //     return true;
        // }

//aproach 2 is freq - 'a'
        int[] freq = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int nums: freq)
            if(nums!= 0){
                return false;
            }

        return true;
    }
}
