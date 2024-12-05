import java.util.Scanner;

public class Sulit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahHariKerja = 0;

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int totalKehadiran = 0;
        int[] hariHadir = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
            totalKehadiran += hariHadir[i];
        }

        int rataRata = totalKehadiran / jumlahSiswa;

        //Rekap kehadiran
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + jumlahHariKerja + " Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }

        //Rata rata kehadiran
        System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");


        //Kesimpulan
        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
    }
}

// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masukkan jumlah siswa: ");
//         int jumlahSiswa = scanner.nextInt();

//         int[] hariHadir = new int[jumlahSiswa];
//         int totalKehadiran = hitungKehadiran(hariHadir, jumlahSiswa); // Panggil fungsi untuk menghitung total kehadiran

//         int rataRata = totalKehadiran / jumlahSiswa;

//         // Rekap Kehadiran
//         rekapKehadiran(hariHadir, jumlahSiswa); // Panggil fungsi untuk rekap kehadiran
//         System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");

//         // Kesimpulan
//         tampilkanKesimpulan(hariHadir, rataRata, jumlahSiswa); // Panggil fungsi untuk menampilkan kesimpulan
//     }

//     // Fungsi untuk menghitung total kehadiran
//     public static int hitungKehadiran(int[] hariHadir, int jumlahSiswa) {
//         int totalKehadiran = 0;
//         for (int i = 0; i < jumlahSiswa; i++) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
//             hariHadir[i] = scanner.nextInt();
//             totalKehadiran += hariHadir[i];
//         }
//         return totalKehadiran;
//     }

//     // Fungsi untuk menampilkan rekap kehadiran
//     public static void rekapKehadiran(int[] hariHadir, int jumlahSiswa) {
//         System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan:");
//         for (int i = 0; i < jumlahSiswa; i++) {
//             System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
//         }
//     }

//     // Fungsi untuk menampilkan kesimpulan
//     public static void tampilkanKesimpulan(int[] hariHadir, int rataRata, int jumlahSiswa) {
//         System.out.println("\nKesimpulan:");
//         System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
//         for (int i = 0; i < jumlahSiswa; i++) {
//             if (hariHadir[i] > rataRata) {
//                 System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
//             }
//         }

//         System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
//         for (int i = 0; i < jumlahSiswa; i++) {
//             if (hariHadir[i] < rataRata) {
//                 System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
//             }
//         }
//     }
// }
