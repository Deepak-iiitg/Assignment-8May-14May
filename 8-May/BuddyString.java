public class BuddyString {
    public boolean buddyStrings(String A, String B) {
        int[] arrA = new int[26];
        int[] arrB = new int[26];
        if(A.length() != B.length()) return false;
        
        for(int i = 0; i < A.length(); i++) {
            arrA[A.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < B.length(); i++) {
            arrB[B.charAt(i)-'a']++;
        }
        
        //check number of chars are same in both strings
        for(int i=0; i<26; i++) {
            if(arrA[i] != arrB[i]) return false;
        }
        
        //check number of different char
        int count = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)) count++;
        }
        
        //if only two then true
        if(count == 2) return true;
        
        //if both strings are same and any char are more than once
        if(count == 0) {
            for(int i=0; i<26; i++) {
                if(arrA[i] > 1) return true;
            }
        }
        
        return false;
    }
    public static void main(String args[]){
        String s = "ab";
        String goal = "ba";
        System.out.println(buddyStrings(s,goal));
    }
}
