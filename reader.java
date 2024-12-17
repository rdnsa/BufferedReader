import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reader {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("apa.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}