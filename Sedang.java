public class Sedang {
    public static void main(String[] args) {
        int totalTabungan = 0;
        int tabunganBulanIni = 100000;

        for (int bulan = 1; bulan <= 12; bulan++) {
            System.out.println("Tabungan bulan ke" + bulan + ": " + "Rp. " + tabunganBulanIni);
            totalTabungan += tabunganBulanIni;
            tabunganBulanIni += 50000;
        }

        System.out.println("Total tabungan selama 12 bulan: Rp. " + totalTabungan);
    }
}

// public class App {
//     public static void main(String[] args) {
//         int totalTabungan = hitungTabungan(); // Panggil fungsi untuk menghitung total tabungan
//         System.out.printf("Total tabungan selama 12 bulan: Rp. " + totalTabungan);
//     }

//     // Fungsi untuk menghitung total tabungan
//     public static int hitungTabungan() {
//         int totalTabungan = 0;
//         int tabunganBulanIni = 100000;

//         for (int bulan = 1; bulan <= 12; bulan++) {
//             System.out.println("Tabungan bulan ke" + bulan + ": " + "Rp. " + tabunganBulanIni);
//             totalTabungan += tabunganBulanIni;
//             tabunganBulanIni += 50000;
//         }
//         return totalTabungan;
//     }
// }
