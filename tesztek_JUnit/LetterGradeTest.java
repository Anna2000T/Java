import org.junit.jupiter.api.Test;

public class LetterGradeTest {
    

    LetterGrade sc = new LetterGrade();

    @Test
    void testDetermineLetterGrade() {
    }

    @Test
    void elsoKilencven()
    {
        sc.determineLetterGrade(90);
    }


    @Test
    void masokdikLegNyolcvan()
    {
        sc.determineLetterGrade(83);
    }


    @Test
    void harmadikLegHetven()
    {
        sc.determineLetterGrade(75);
    }

    @Test
    void negyedikLegHatvan()
    {
        sc.determineLetterGrade(61);
    }


}
