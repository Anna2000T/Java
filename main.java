public class main {

    public static void main(String[] args) {

        Gardróbszekrény w = new Gardróbszekrény();

        w.addCloth(new felsoruhazat("skirt","blue",6,2));
        w.addCloth(new alsoruhazat("Boxer brief","navy",6,2));
        
        w.addCloth(new felsoruhazat());
        w.addCloth(new alsoruhazat());

        w.needsToBeWashed();



        
    }
    
}
