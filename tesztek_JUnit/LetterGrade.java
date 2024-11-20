public class LetterGrade {


    public String determineLetterGrade(int a)
    {
        String eredmeny = "";
        if(a < 0 || a > 100)
        {
            throw new IllegalArgumentException();
        }
        
        if(a < 90)
        {
            eredmeny = "A";

        }
        if(a < 80)
        {
            eredmeny = "B";

        }
        if(a < 70)
        {
            eredmeny = "C";

        }
        if(a < 60)
        {
            eredmeny = "D";

        }
        if(a > 50)
        {
            eredmeny = "E";

        }
        if(a < 50)
        {
            eredmeny = "F";

        }
        return eredmeny;
        

    }

    
}

