package letcode;

import a.H;

import java.util.HashMap;

class Solution {
    public  static  int lengthOfLongestSubstring(String s) {
      if (s.length()==0){
          return 0;
      }
        System.out.println(s);
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int max=0;
        int left=0;
        for (int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i))){
                left=Math.max(left,hashMap.get(s.charAt(i))+1);
            }
            hashMap.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcad"));
    }
}

