public class RemoveSpecial {

    static String remove(String s){
        String r = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                r = r+s.charAt(i);
            }
        }
        return r;
    }
    public static void main(String args[]){
        String s = "asg1&gf$5%'k";
        System.out.println(remove(s));
    }
    
}
