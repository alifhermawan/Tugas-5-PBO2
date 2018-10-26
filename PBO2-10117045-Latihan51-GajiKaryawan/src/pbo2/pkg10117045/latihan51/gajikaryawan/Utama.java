package pbo2.pkg10117045.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menghitung total gaji 
 * karyawan dari penjumlahan tunjangan jabatan, golongan dan kehadiran
 */
public class Utama {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);

        Manager man = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        man.setNik(scn.next());
        System.out.print("Masukan Nama : ");
        man.setNama(scn1.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        man.setGolongan(scn2.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        man.setJabatan(scn3.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        man.setKehadiran(scn4.nextInt());
        System.out.println("/n====Hasil Perhitungan : ");
        System.out.println("NIK\t: " + man.getNik());
        System.out.println("NAMA\t: " + man.getNama());
        System.out.println("GOLONGAN: " + man.getGolongan());
        System.out.println("JABATAN\t: " + man.getJabatan());

        System.out.println("TUNJANGAN GOLONGAN\t: " + man.tunjanganGolongan(man.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + man.tunjanganJabatan(man.getJabatan()));
        System.out.println("TUNJANGN KEHADIRAN\t: " + man.tunjanganKehadiran(man.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: " + man.gajiTotal());
    }

}
