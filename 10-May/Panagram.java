public class Panagram {

    static boolean checkPanagram(String s){

        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a'] = 1;
        }

        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }

        return true;

    }

    public static void main(String args[]){
        //String s = "aahdqwgteuqwpqjaxkgaxmxrxklxjaiogbnzxvbczxxyysspf";
        String s="leetcode";
        System.out.println(checkPanagram(s));
    }
    
}
