import java.util.*;

public class Product {

    static int product(String s){
        int m = 1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                 int x = Character.getNumericValue(s.charAt(i));
                 m = m*x;
            }
        }

        return m;
    }

     public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
         //String s = sc.next();
         String s = "hajd18jh29k";
         System.out.println(product(s));
     }
    
}
