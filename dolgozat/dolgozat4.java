import java.util.Scanner;

public class dolgozat4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérek egy számot 1 és 10 között: ");
        double szam = scanner.nextInt();

        if(szam < 1 || szam > 10){
            System.out.println("A szám helytelen!");
        }
        else
        {
            System.out.println();
        }

        
    }
    
}
