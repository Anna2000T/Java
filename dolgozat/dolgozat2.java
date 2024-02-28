import java.util.Scanner;

public class dolgozat2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérek egy számot: ");
        double szam = scanner.nextInt();

        double osszeg = (Math.pow(szam, 2)*Math.PI);

        System.out.println("The triangle area: " + osszeg  +  " rounded area: " + Math.ceil(osszeg));


    }

}
