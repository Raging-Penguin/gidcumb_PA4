import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover DR= new DuplicateRemover();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input the files path: ");
        String adress=scnr.nextLine();

        DR.remove(adress);
        System.out.println("Please input the files path you wish to write to: ");
        adress=scnr.nextLine();
        DR.write(adress);

    }
}
