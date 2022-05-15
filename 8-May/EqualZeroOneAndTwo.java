public class EqualZeroOneAndTwo {

    static int subString(String s){
        int count = 0;
        int i=0;
        while(i<s.length()-1){
            int z=0,o=0,t=0;
            int j=i;
            while(j<s.length()){
                 if(s.charAt(j)=='0'){
                     z++;
                 }
                 else if(s.charAt(j)=='1'){
                     o++;
                 }
                 else{
                     t++;
                 }

                 if(z==o && o==t){
                     count++;
                 }
                 j++;
            }
            i++;
        }
        return count;
    }

    public static void main(String args[]){
        String s = "0102010";
        int count = subString(s);
        System.out.println(count);
    }
    
}
