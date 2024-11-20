public class Palindrom {

    public boolean isPalindrom(String szo)
    {
        String ujszo = "";

        for (int i = 0; i > szo.length(); i--) {

            ujszo += szo;

        }

        if(szo == ujszo)
        {
            return true;

        }
        else
        {
            return false;
        }

    }


}
