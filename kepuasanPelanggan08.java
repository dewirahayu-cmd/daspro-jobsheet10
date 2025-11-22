import java.util.Scanner;

public class kepuasanPelanggan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasilSurvei = new int[10][6];
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        // Input data survei
        System.out.println("--- Input Hasil Kepuasan Pelanggan ---");
        System.out.println("Penilaian: 1-5");
        System.out.println();

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("  Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Menampilkan hasil survei
        System.out.println("\n---Hasil Survei---");
        System.out.print("Responden\t");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            System.out.print("P" + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("=".repeat(60));

        for (int i = 0; i < jumlahResponden; i++) {
            System.out.print("R" + (i + 1) + "\t\t");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print(hasilSurvei[i][j] + "\t");
            }
            System.out.println();
        }

        // Menghitung rata-rata per responden
        System.out.println("\n=== RATA-RATA KEPUASAN PER RESPONDEN ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = total / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataRata);
        }

        // Menghitung rata-rata per pertanyaan
        System.out.println("\n=== RATA-RATA KEPUASAN PER PERTANYAAN ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += hasilSurvei[i][j];
            }
            double rataRata = total / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }

        // Menghitung rata-rata keseluruhan
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("Rata-rata kepuasan keseluruhan: " + rataRataKeseluruhan);

        sc.close();
    }
}
