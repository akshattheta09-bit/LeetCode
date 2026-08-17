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