import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("apa.txt");

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        writer.println("Nama: " + nama);
        writer.println("Usia: " + usia);

        scanner.close();
        writer.close();

        System.out.println("Data telah disimpan ke file output.txt");
    }
}