import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n===============================================");
    System.out.println("Program Mencari Nilai Terendah dan Tertinggi dari 10 Mahasiswa");

    int jumlahMahasiswaLulus = 0;
    double nilai, terendah = 100, tertinggi = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai >  60) {
                ++jumlahMahasiswaLulus;
                // System.out.println("Status: Lulus\n");
                
            } else {
                System.out.println("Status: Tidak Lulus\n");
            }
        }
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahMahasiswaLulus);
        System.out.println("===============================================\n");
    }
}