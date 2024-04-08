import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę którą chcesz zamienic na pierwiastek: ");

        try{
            double liczba = scanner.nextDouble();
            if(liczba < 0){
                throw new IllegalArgumentException();
            }
            System.out.println(Math.sqrt(liczba));
        }
        catch (InputMismatchException e){
            System.out.println("Podaj liczby, nie litery");
        }
        catch (IllegalArgumentException e){
            System.out.println("Podałeś liczbę ujemną");
        }

    }
}