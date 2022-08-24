import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class cc1_1 {
    public cc1_1() {
    }

    /**
     * unique char string with/out additional data structure
     */

    public static Boolean isUnique(String str){
        HashSet<Character> h = new HashSet<>();
        for(Character c : str.toCharArray()){
            if(h.contains(c)){
                return false;
            }
            h.add(c);

        }
        return  true;
    }

    public static Boolean isUnique2(String str){
        Boolean[] b = new Boolean[128];
        Arrays.fill(b,false);

        for(int i = 0;i <str.length();i++){
            int val = str.charAt(i);
           if (b[val]){
               return false;
           }
           b[val] = true;

        }
        return  true;
    }

    public static Boolean isUnique3(String str){
        int checker =0;
        for(int i =0; i <str.length();i++){
            int val = str.charAt(i);
            if((checker & (1<<val)) >0){
                return false;
            }
            checker |= 1<<val;
        }
        return true;
    }
}
