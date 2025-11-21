import java.util.Scanner;

public class bioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("---Menu Bioskop---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    } else {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris-1][kolom-1]);
                        System.out.println("Harap pilih kembali kursi yang masih kosong");
                    }
                } else {
                    System.out.println("Nomor baris/kolom tidak tersedia!");
                }

            } else if (menu == 2) {
                System.out.println("---Daftar Penonton---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;

            } else {
                System.out.println("Menu tidak valid! Pilih menu 1-3.");
            }
        }
        
        sc.close();
    }
}


    

