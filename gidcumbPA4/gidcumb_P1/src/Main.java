import java.io.IOException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws IOException {
            DuplicateRemover duplicateRemover= new DuplicateRemover();
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please input the files path: ");
            String adress=scnr.nextLine();

            duplicateRemover.remove(adress);
            System.out.println("Please input the files path you wish to write to: ");
            adress=scnr.nextLine();
            duplicateRemover.write(adress);

        }
    }


