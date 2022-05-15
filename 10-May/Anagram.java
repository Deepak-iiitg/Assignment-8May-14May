public class Anagram {

    static boolean checkAnagram(String s1,String s2){
       
        if(s1.length()!=s2.length()){
            return false;
        }

        int arr[] = new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]>0){
                return false;
            }
        }


        return true;
    }

    public static void main(String args[]){
        String s1 = "abns";
        String s2 = "snba";

        System.out.println(checkAnagram(s1,s2));
    }
    
}
