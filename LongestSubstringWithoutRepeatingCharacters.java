import java.util.HashMap;
class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String args[]){
        String s = "absdeaab";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l =0;
        int r = 0;
        int maxLen=0;
        int n = s.length();
        while(r<n){
            if(map.containsKey(s.charAt(r))&&map.get(s.charAt(r))>=l){
                
                    l=map.get(s.charAt(r))+1;
                
            }
            int length = r-l+1;
            maxLen = Math.max(length,maxLen);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxLen;
    }
}