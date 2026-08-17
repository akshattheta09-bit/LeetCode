// First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

import java.util.Stack;

class prob_387{
    public int firstUniqueChar(String s){
        int n = s.size();
        for(int i = 0;i < n;i++){
            boolean dupFound = false;
            for(int j =0;j<n ; j++){
                if(i == j) continue;
                if(s[i] == s[j]){
                    dupFound = true;
                    break;
                }
            }
            if(dupFound == False    ){
                return i;
            }
        }
        return -1;
    }
}




// Solution using HashMap:
// to reduce the time complexity to O(n) we can use a HashMap to store the frequency of each character in the string. Then, we can iterate through the string again to find the first character with a frequency of 1.


Class Solution (
public int firstUniqChar(String s) {
    int n = s.length();
    HashMap<Character, Integer> mp = new HashMap<>();

 for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        
        char[] str = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (mp.get(str[i]) == 1) {
                return i;
            }
        }
        

        return -1; 
    }