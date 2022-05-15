import java.util.*;

public class CountAlpbaSpecialDigit {

    static void count(String s){
        int dcount = 0,acount=0,scount=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                dcount++;
            }
            else if(Character.isLetter(s.charAt(i))){
                acount++;
            }else{
                scount++;
            }
        }

        System.out.println("alphabet : "+acount);
        System.out.println("digit : "+dcount);
        System.out.println("special "+scount);
    }
    public static void main(String args[]){
          //Scanner sc = new Scanner(System.in);
          //String s = sc.nextInt();
          String s = "sdh178,.%$#";
          count(s);
     }
    
}
