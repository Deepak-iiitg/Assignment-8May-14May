public class RemoveUpperSpecial {


    static String remove(String s){
        String r = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLowerCase(s.charAt(i))){
                r = r+s.charAt(i);
            }
        }
        return r;
    }
    public static void main(String args[]){
        String s = "asAY16*$#h^mK(";
        System.out.println(remove(s));
    }
    
}
