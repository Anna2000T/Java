import java.util.Scanner;

public class dolgozat1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem adja meg a nevét: ");
        String name = scanner.nextLine();

        System.out.println("Helló " + name + " !");
        
    }
}