import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Langsung set umur tanpa input
        int umur = 29;
        System.out.println("Umur yang dimasukkan: " + umur);

        // 1. IF & NESTED IF (Kategori umur)
        if (umur >= 0) {
            if (umur <= 12) {
                System.out.println("Kategori: Anak");
            } else if (umur <= 17) {
                System.out.println("Kategori: Remaja");
            } else {
                System.out.println("Kategori: Dewasa");
            }
        } else {
            System.out.println("Umur tidak valid!");
        }

        System.out.println();

        // 2. LOOP FOR (Cetak angka 1 - 100)
        System.out.println("FOR LOOP: Angka 1 - 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 3. LOOP WHILE (Cetak angka 1 - 10)
        System.out.println("WHILE LOOP: Angka 1 - 10");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // 4. LOOP DO-WHILE (Cetak angka 1 - 5)
        System.out.println("DO-WHILE LOOP: Angka 1 - 5");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println("\n");

        // 5. TRY-CATCH (Pembagian)
        try {
            // Angka sudah ditentukan langsung (tanpa input)
            int pembilang = 10;
            int penyebut = 2;

            System.out.println("Pembilang: " + pembilang);
            System.out.println("Penyebut: " + penyebut);

            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Error: Input tidak valid!");
        }
    }
}
