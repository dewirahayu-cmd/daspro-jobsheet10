import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah: ");
        int m = sc.nextInt();

        int [][] nilai = new int[n][m];

        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++){
                System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j]; 
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa/m);
        }
        System.out.println("\n===================================");
        System.out.println("Rata-rata nilai setiap Mata Kuliah: ");

        for (int j = 0; j < m; j++){
            double totalPermatkul = 0;
            for (int i = 0; i < n; i++){
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPermatkul / n);
        }

        sc.close();
    }
}
