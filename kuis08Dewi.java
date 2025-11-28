import java.util.Scanner;

public class kuis08Dewi {
    public static void main(String[] args) {
        
        // insialisasi dan deklarasi
        String[] kategoriBuku = {"Fiksi", "Non-Fiksi", "Pendidikan", "Komik", "Anak-anak"};
        String[] namaHari = {"Senin", "Sabtu", "Minggu"};
        
        int[][] penjualan = {
            {6, 9, 8},     // Fiksi
            {5, 7, 6},     // Non-Fiksi
            {7, 8, 9},     // Pendidikan
            {4, 6, 7},     // Komik
            {3, 5, 4}      // Anak-anak
        };
        
        int[] hargaBuku = {50000, 50000, 35000, 35000, 35000};
        
        System.out.println("---SISTEM TOKO BUKU---\n");
        
        System.out.println("Banyaknya buku yang terjual di masing-masing hari:");
        
        for (int j = 0; j < namaHari.length; j++) {
            int totalPerHari = 0;
            System.out.println("\nHari " + namaHari[j] + ":");
            
            for (int i = 0; i < kategoriBuku.length; i++) {
                System.out.println("  - " + kategoriBuku[i] + ": " + penjualan[i][j] + " buku");
                totalPerHari += penjualan[i][j];
            }
            
            System.out.println("  Total buku terjual: " + totalPerHari + " buku");
        }
    
        System.out.println("Total pemasukan toko selama 3 hari: ");
        
        int totalPemasukan = 0;
        
        for (int j = 0; j < namaHari.length; j++) {
            int pemasukanPerHari = 0;
            System.out.println("\nHari " + namaHari[j] + ":");
            
            for (int i = 0; i < kategoriBuku.length; i++) {
                int pemasukan = penjualan[i][j] * hargaBuku[i];
                pemasukanPerHari += pemasukan;
                System.out.println("  - " + kategoriBuku[i] + ": " + penjualan[i][j] + 
                                   " buku" + "\n = Rp" + hargaBuku[i] + "\t= Rp " + pemasukan);
            }
            
            System.out.println("  total: Rp " + pemasukanPerHari);
            totalPemasukan += pemasukanPerHari;
        }
        
     
        System.out.println("\nTOTAL PEMASUKAN SELAMA 3 HARI: Rp " + totalPemasukan);
    
    }
}

