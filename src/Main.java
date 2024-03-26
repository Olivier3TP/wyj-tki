import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(Path.of("tekst.txt"));

//        int[] tab = {1, 2, 3};
//        for(int i = 0; i<10; i++){
//            System.out.println(tab[i]);
//        }

        StosWyjatkow stosWyjatkow = new StosWyjatkow();
        try{
            stosWyjatkow.metoda1();
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("XDD");

    }
}