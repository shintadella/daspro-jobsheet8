import java.util.Scanner;
public class Tugas2_22 {
    // Private static variable for better encapsulation
    private static int j;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();  // Consume the newline character after int input

        final int jumlahAtletCabor = 5;
        final int jumlahCabor = 4;
        String[] namaPoliteknik = new String[jumlahPoliteknik];
        String[][][] atlet = new String[jumlahPoliteknik][jumlahCabor][jumlahAtletCabor];
        String[] namaCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.print("Masukkan Nama Politeknik " + (i + 1) + ": ");
            namaPoliteknik[i] = sc.nextLine();
        }
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Politeknik " + namaPoliteknik[i] + ":");
            for (int j = 0; j < jumlahAtletCabor; j++) {
                System.out.println("Masukkan Nama " + jumlahAtletCabor + " Atlet untuk " + namaCabor[j] + ":");
                for (int k = 0; k < jumlahAtletCabor; k++) {
                    System.out.print("Atlet " + (k + 1) + ":");
                    atlet[i][j][k] = sc.nextLine();
                }
            }
        }
    }
}