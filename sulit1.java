import java.util.Scanner;

public class sulit1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        int[] nilaiSiswa = new int[jumlahSiswa];

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan Nilai Siswa");
            System.out.println("2. Hitung Rata-Rata Nilai");
            System.out.println("3. Tampilkan Semua Nilai");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi yang ingin dilakukan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    masukkanNilaiSiswa( input,nilaiSiswa);
                    break;
                case 2:
                    hitungRataRataNilai(nilaiSiswa);
                    break;
                case 3:
                    tampilkanSemuaNilai(nilaiSiswa);
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }

    static void masukkanNilaiSiswa(Scanner input, int[] nilaiSiswa) {
        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextInt();
        }
    }

    static void hitungRataRataNilai(int[] nilaiSiswa) {
        int total = 0;
        for (int nilai : nilaiSiswa) {
            total += nilai;
        }
        double rataRata = (double) total / nilaiSiswa.length;
        System.out.println("Rata-rata nilai siswa: " + rataRata);
    }

    static void tampilkanSemuaNilai(int[] nilaiSiswa) {
        System.out.println("Semua nilai siswa:");
        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + nilaiSiswa[i]);
        }
    }
}

    
