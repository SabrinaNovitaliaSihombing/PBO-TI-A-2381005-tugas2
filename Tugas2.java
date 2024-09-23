import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");

        int pilihanBangunDatar = scanner.nextInt();

        if (pilihanBangunDatar == 1) {
            System.out.print("Masukkan sisi persegi: ");
            double sisi = scanner.nextDouble();
            double luas = hitungLuasPersegi(sisi);
            double keliling = hitungKelilingPersegi(sisi);
            System.out.printf("Luas: %.2f, Keliling: %.2f%n", luas, keliling);
        } else if (pilihanBangunDatar == 2) {
            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = scanner.nextDouble();
            double luas = hitungLuasPersegiPanjang(panjang, lebar);
            double keliling = hitungKelilingPersegiPanjang(panjang, lebar);
            System.out.printf("Luas: %.2f, Keliling: %.2f%n", luas, keliling);
        } else if (pilihanBangunDatar == 3) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();
            double luas = hitungLuasLingkaran(jariJari);
            double keliling = hitungKelilingLingkaran(jariJari);
            System.out.printf("Luas: %.2f, Keliling: %.2f%n", luas, keliling);
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}