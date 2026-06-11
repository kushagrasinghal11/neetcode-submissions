class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int freq[] = new int[26];
        char chS;
        char chT;
        for (int i=0; i< s.length(); i++){
            chS = s.charAt(i);
            chT = t.charAt(i);
            freq[chS-'a']= freq[chS-'a']+1;
            freq[chT-'a']= freq[chT-'a']-1;
        }

        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                return false;
            }
        }

        return true;
    }
}
