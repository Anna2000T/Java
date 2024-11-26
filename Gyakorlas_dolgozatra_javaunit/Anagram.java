import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    boolean isAnagram(char[] szo1, char[] szo2) {

        int szo1_db = szo1.length;
        int szo2_db = szo1.length;


        if(szo1_db != szo2_db)
        {
            return false;
        }

        Arrays.sort(szo1);
        Arrays.sort(szo2);


        for(int i = 0;i < szo1_db ; i++)
        {
            if(szo1[i] != szo2[i]){
                return false;
            }

        }

        return true;

        
    }


    
}
